package com.rafengimprove.miniairport.service.impl

import com.rafengimprove.miniairport.model.dto.TerminalDto
import com.rafengimprove.miniairport.model.dto.toEntity
import com.rafengimprove.miniairport.model.entity.toDto
import com.rafengimprove.miniairport.repository.TerminalRepository
import com.rafengimprove.miniairport.service.TerminalService
import org.springframework.stereotype.Service

@Service
class TerminalServiceImpl(val terminalRepository: TerminalRepository): TerminalService {
    override fun save(terminal: TerminalDto): TerminalDto {
        return terminalRepository.save(terminal.toEntity()).toDto()
    }

    override fun deleteById(id: Long) {
        terminalRepository.findById(id)
        return terminalRepository.deleteById(id)
    }
}