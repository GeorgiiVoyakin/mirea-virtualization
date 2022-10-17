package com.example.demo

import javax.persistence.*

@Entity
@Table(name = "Cars")
data class Car(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val model: String,
    val brand: String,
)