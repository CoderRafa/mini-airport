package com.rafengimprove.miniairport.repository

import com.rafengimprove.miniairport.model.entity.PlaneEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PlaneRepository: JpaRepository<PlaneEntity, Long> {
}