package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class ElementsController(private val elementsRepository: ElementsRepository) {
  @GetMapping("/elements")
  fun findAll(): ResponseEntity<List<Element>> {
    return ResponseEntity.ok(elementsRepository.findAll())
  }

  @PostMapping("/elements")
  fun addElement(@RequestBody element: Element): ResponseEntity < String > {
    elementsRepository.save(element)
    return ResponseEntity.ok("New element added")
  }
}