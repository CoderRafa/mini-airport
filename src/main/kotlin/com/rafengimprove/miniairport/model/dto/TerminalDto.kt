package com.rafengimprove.miniairport.model.dto

import com.rafengimprove.miniairport.model.entity.RunwayEntity
import com.rafengimprove.miniairport.model.entity.TerminalEntity
import com.rafengimprove.miniairport.type.NavigationType

/**
 * DTO for {@link com.rafengimprove.miniairport.model.entity.TerminalEntity}
 */
data class TerminalDto(
    val id: Long? = null,
    val navigationTypes: MutableSet<NavigationType> = mutableSetOf(),
    val maxHangerHeight: Int? = null,
    val noiseLevel: Int? = null
) {
    var runways: MutableSet<RunwayDto> = mutableSetOf()
}

fun TerminalDto.toEntity(runways: MutableSet<RunwayEntity>? = null) = TerminalEntity().apply {
    this.id = this@toEntity.id
    this.navigationTypes = this@toEntity.navigationTypes
    this.maxHangerHeight = this@toEntity.maxHangerHeight
    this.noiseLevel = this@toEntity.noiseLevel
    this.runways = runways ?: this@toEntity.runways.map { it.toEntity() }.toMutableSet()
}