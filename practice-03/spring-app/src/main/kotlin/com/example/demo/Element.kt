package com.example.demo

import javax.persistence.*

@Entity
@Table(name = "Elements")
data class Element(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val content: String,
)