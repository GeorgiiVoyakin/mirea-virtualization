package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface ElementsRepository : JpaRepository<Element, Long>