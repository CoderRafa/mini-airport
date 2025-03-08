package com.rafengimprove.miniairport.model.dto

import com.rafengimprove.miniairport.model.entity.RunwayEntity
import java.io.Serializable

/**
 * DTO for {@link com.rafengimprove.miniairport.model.entity.RunwayEntity}
 */
data class RunwayDto(
    val id: Long? = null,
    val length: Int? = null,
    val width: Int? = null,
    val weightCanTake: Int? = null
) {
    var terminal: TerminalDto? = null
}

fun RunwayDto.toEntity() = RunwayEntity().apply {
    this.id = this@toEntity.id
    this.length = this@toEntity.length
    this.width = this@toEntity.width
    this.weightCanTake = this@toEntity.weightCanTake
}