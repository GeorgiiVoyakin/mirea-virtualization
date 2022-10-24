package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class MainController(
    private val carRepository: CarRepository, 
    private val clientsRepository: ClientsRepository,
    private val malfunctionRepository: MalfunctionRepository
) {
  
}