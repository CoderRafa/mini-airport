package com.rafengimprove.miniairport.model.entity

import com.rafengimprove.miniairport.model.dto.PlaneDto
import com.rafengimprove.miniairport.type.NavigationType
import jakarta.persistence.*

@Entity
@Table(name = "plane")
open class PlaneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plane_seq")
    @SequenceGenerator(name = "plane_seq")
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Column(name = "name")
    open var name: String? = null

    @Column(name = "seat_number")
    open var seatNumber: Int? = null

    @Column(name = "wingspan")
    open var wingspan: Int? = null

    @Column(name = "length")
    open var length: Int? = null

    @Column(name = "height")
    open var height: Int? = null

    @Column(name = "weight")
    open var weight: Int? = null

    @Column(name = "max_speed")
    open var maxSpeed: Int? = null

    @Column(name = "takeoff_distance")
    open var takeoffDistance: Int? = null

    @Column(name = "landing_distance")
    open var landingDistance: Int? = null

    @Column(name = "noise_level")
    open var noiseLevel: Int? = null

    @Enumerated(EnumType.STRING)
    @Column(name = "navigation_type")
    open var navigationType: NavigationType? = null
}

fun PlaneEntity.toDto() = PlaneDto(
    id, name, seatNumber, wingspan, length,
    height, weight, maxSpeed, takeoffDistance,
    landingDistance, noiseLevel, navigationType
)