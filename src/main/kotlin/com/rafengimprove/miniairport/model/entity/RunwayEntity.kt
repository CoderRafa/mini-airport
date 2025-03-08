package com.rafengimprove.miniairport.model.entity

import com.rafengimprove.miniairport.model.dto.RunwayDto
import jakarta.persistence.*

@Entity
@Table(name = "runway")
open class RunwayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "runway_seq")
    @SequenceGenerator(name = "runway_seq")
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(name = "length")
    open var length: Int? = null

    @Column(name = "width")
    open var width: Int? = null

    @Column(name = "weight_can_take")
    open var weightCanTake: Int? = null

    @ManyToOne(cascade = [CascadeType.REFRESH])
    @JoinColumn(name = "terminal_entity_id")
    open var terminalEntity: TerminalEntity? = null


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RunwayEntity) return false

        if (id != other.id) return false
        if (length != other.length) return false
        if (width != other.width) return false
        if (weightCanTake != other.weightCanTake) return false
        return terminalEntity == other.terminalEntity
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (length ?: 0)
        result = 31 * result + (width ?: 0)
        result = 31 * result + (weightCanTake ?: 0)
        result = 31 * result + (terminalEntity?.hashCode() ?: 0)
        return result
    }

}

fun RunwayEntity.toDto(): RunwayDto {
    val runwayDto = RunwayDto(
        this.id, this.length, this.width, this.weightCanTake
    )

    runwayDto.terminal = this.terminalEntity?.toDto()

    return runwayDto
}

