package com.rafengimprove.miniairport.controller

import com.rafengimprove.miniairport.model.dto.TerminalDto
import com.rafengimprove.miniairport.service.TerminalService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/terminal")
class TerminalController(val terminalService: TerminalService) {
    private val log = LoggerFactory.getLogger(TerminalController::class.java)

    @PostMapping
    fun save(@RequestBody terminal: TerminalDto): TerminalDto {
        log.debug("Save a new terminal")
        return terminalService.save(terminal)
    }

    @DeleteMapping("/{id}")
    fun deleteById(
        @PathVariable("id") id: Long
    ) {
       return  terminalService.deleteById(id)
    }
}