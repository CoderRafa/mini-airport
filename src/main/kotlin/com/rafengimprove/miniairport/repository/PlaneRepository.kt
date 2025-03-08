package com.rafengimprove.miniairport.repository

import com.rafengimprove.miniairport.model.entity.PlaneEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PlaneRepository: JpaRepository<PlaneEntity, Long> {

    @Query("select p from PlaneEntity p")
    fun findAllSorted(pageable: Pageable): Page<PlaneEntity>

}