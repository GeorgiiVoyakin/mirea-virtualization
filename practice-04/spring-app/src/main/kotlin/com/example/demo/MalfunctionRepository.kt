package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface MalfunctionRepository : JpaRepository<Malfunction, Long>