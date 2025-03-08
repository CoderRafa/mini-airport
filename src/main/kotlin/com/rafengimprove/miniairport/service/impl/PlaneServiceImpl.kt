package com.rafengimprove.miniairport.service.impl

import com.rafengimprove.miniairport.model.dto.PlaneDto
import com.rafengimprove.miniairport.model.dto.toEntity
import com.rafengimprove.miniairport.model.entity.toDto
import com.rafengimprove.miniairport.repository.PlaneRepository
import com.rafengimprove.miniairport.service.PlaneService
import com.rafengimprove.miniairport.type.SortType
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PlaneServiceImpl(val planeRepository: PlaneRepository): PlaneService {
    override fun save(plane: PlaneDto): PlaneDto {
        return planeRepository.save(plane.toEntity()).toDto()
    }

    override fun getAll(): List<PlaneDto> {
        return planeRepository.findAll().map { it.toDto() }
    }

    override fun getAllSorted(field: String, sortType: SortType, pageable: Pageable): Page<PlaneDto> {
        return planeRepository.findAllSorted(pageable).map { it.toDto() }
    }

}