package com.rafengimprove.miniairport.model.dto

import com.rafengimprove.miniairport.model.entity.PlaneEntity
import com.rafengimprove.miniairport.type.NavigationType
import java.io.Serializable

/**
 * DTO for {@link com.rafengimprove.miniairport.model.entity.PlaneEntity}
 */
data class PlaneDto(
    val id: Long? = null,
    val name: String? = null,
    val seatNumber: Int? = null,
    val wingspan: Int? = null,
    val length: Int? = null,
    val height: Int? = null,
    val weight: Int? = null,
    val maxSpeed: Int? = null,
    val takeoffDistance: Int? = null,
    val landingDistance: Int? = null,
    val noiseLevel: Int? = null,
    val navigationType: NavigationType? = null
) : Serializable

fun PlaneDto.toEntity() = PlaneEntity().apply {
    this.id = this@toEntity.id
    this.name = this@toEntity.name
    this.seatNumber = this@toEntity.seatNumber
    this.wingspan = this@toEntity.wingspan
    this.length = this@toEntity.length
    this.height = this@toEntity.height
    this.weight = this@toEntity.weight
    this.maxSpeed = this@toEntity.maxSpeed
    this.takeoffDistance = this@toEntity.takeoffDistance
    this.landingDistance = this@toEntity.landingDistance
    this.noiseLevel = this@toEntity.noiseLevel
    this.navigationType = this@toEntity.navigationType
}