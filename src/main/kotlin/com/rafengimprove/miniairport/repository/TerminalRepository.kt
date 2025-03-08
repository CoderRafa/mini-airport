package com.rafengimprove.miniairport.repository

import com.rafengimprove.miniairport.model.entity.TerminalEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TerminalRepository : JpaRepository<TerminalEntity, Long> {
}