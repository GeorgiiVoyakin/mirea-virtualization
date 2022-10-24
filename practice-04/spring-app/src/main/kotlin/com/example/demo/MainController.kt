package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class MainController(
    private val carRepository: CarRepository, 
    private val clientsRepository: ClientsRepository,
    private val malfunctionRepository: MalfunctionRepository
) {
    @PostMapping("/api/cars")
    fun addCar(@RequestBody car: Car): ResponseEntity<Car> {
        carRepository.save(car)
        return ResponseEntity.ok(car)
    }

    @GetMapping("/api/cars")
    fun getCars(): ResponseEntity<MutableList<Car>> {
        return ResponseEntity.ok(carRepository.findAll())
    }
}