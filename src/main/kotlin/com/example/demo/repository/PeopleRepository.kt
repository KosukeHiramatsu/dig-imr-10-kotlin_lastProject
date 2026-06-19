package com.example.demo.repository

import com.example.demo.entity.People
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PeopleRepository : JpaRepository<People, Long> {
    fun findPeopleById (id:Long):People?

}