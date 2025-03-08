package com.rafengimprove.miniairport.service

import com.rafengimprove.miniairport.model.dto.PlaneDto
import com.rafengimprove.miniairport.type.SortType
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable

interface PlaneService {
    fun save(plane: PlaneDto): PlaneDto

    fun getAll(): List<PlaneDto>

    fun getAllSorted(
        field: String, sortType: SortType,
        pageable: Pageable = PageRequest.of(0, 10, sortType.toSort(field))
    ): Page<PlaneDto>
}