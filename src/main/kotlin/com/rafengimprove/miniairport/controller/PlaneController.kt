package com.rafengimprove.miniairport.controller

import com.rafengimprove.miniairport.model.dto.PlaneDto
import com.rafengimprove.miniairport.service.PlaneService
import com.rafengimprove.miniairport.type.SortType
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/plane")
class PlaneController(val planeService: PlaneService) {
    val log = LoggerFactory.getLogger(PlaneController::class.java)

    @PostMapping
    fun save(@RequestBody plane: PlaneDto): PlaneDto {
        log.debug("Save a new plane")
        return planeService.save(plane)
    }

    @GetMapping
    fun getAll(): List<PlaneDto> {
        return planeService.getAll()
    }

    @GetMapping("/sorted")
    fun getAllSorted(
        @RequestParam field: String,
        @RequestParam sortType: SortType
    ): Page<PlaneDto> {
        return planeService.getAllSorted(field, sortType)
    }
}