package com.rafengimprove.miniairport.service

import com.rafengimprove.miniairport.model.dto.PlaneDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface PlaneService {
    fun save(plane: PlaneDto): PlaneDto

    fun getAll(): List<PlaneDto>
}