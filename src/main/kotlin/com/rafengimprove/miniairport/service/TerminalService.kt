package com.rafengimprove.miniairport.service

import com.rafengimprove.miniairport.model.dto.TerminalDto

interface TerminalService {
    fun save(terminal: TerminalDto): TerminalDto
    fun deleteById(id: Long)
}