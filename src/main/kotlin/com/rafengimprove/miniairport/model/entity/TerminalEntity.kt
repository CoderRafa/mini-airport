package com.rafengimprove.miniairport.model.entity

import com.rafengimprove.miniairport.model.dto.TerminalDto
import com.rafengimprove.miniairport.type.NavigationType
import jakarta.persistence.*

@Entity
@Table(name = "terminal")
open class TerminalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "terminal_seq")
    @SequenceGenerator(name = "terminal_seq")
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @ElementCollection(targetClass = NavigationType::class)
    @JoinTable(name = "tblNavigations", joinColumns = [JoinColumn(name = "navigationId")])
    @Column(name = "navigation_types", nullable = false)
    @Enumerated(EnumType.STRING)
    open var navigationTypes: MutableSet<NavigationType> = mutableSetOf()

    @Column(name = "max_hanger_height")
    open var maxHangerHeight: Int? = null

    @Column(name = "noise_level")
    open var noiseLevel: Int? = null

    @OneToMany(mappedBy = "terminalEntity", cascade = [CascadeType.ALL], orphanRemoval = true)
    open var runways: MutableSet<RunwayEntity> = mutableSetOf()
}

fun TerminalEntity.toDto(): TerminalDto {
    val terminalDto = TerminalDto(
        this.id, this.navigationTypes, this.maxHangerHeight, this.noiseLevel
    )
    terminalDto.runways = this.runways.map { it.toDto() }.toMutableSet()

    return terminalDto
}
