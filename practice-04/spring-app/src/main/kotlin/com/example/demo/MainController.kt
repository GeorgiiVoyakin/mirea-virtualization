package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class MainController(
    private val carRepository: CarRepository, 
    private val clientRepository: ClientRepository, 
    private val malfunctionRepository: MalfunctionRepository
) {
  
}