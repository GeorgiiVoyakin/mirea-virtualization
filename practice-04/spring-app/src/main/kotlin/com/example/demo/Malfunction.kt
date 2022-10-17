package com.example.demo

import javax.persistence.*

@Entity
@Table(name = "Malfunctions")
data class Malfunction(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val description: String,
)