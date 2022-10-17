package com.example.demo

import javax.persistence.*

@Entity
@Table(name = "Clients")
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val name: String,
)