package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository

interface ClientsRepository : JpaRepository<Client, Long>