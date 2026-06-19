package com.example.demo.service

import com.example.demo.entity.People
import java.util.Optional


interface PeopleService {
    fun getPeople(id: Long): People?
    fun getPeopleAll(): List<People>?
    fun savePeople(people:People): People
//    fun updatePeople(id:Long, people: People): People?
    fun deletePeople(id: Long): Unit
}