package com.example.demo.controller

import com.example.demo.service.PeopleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import com.example.demo.entity.People
import java.util.Optional

//data class People(val id: Long=0, val name: String)
data class SavePeopleRequest(val name: String, val country: String)

@RestController
class PeopleController(private val peopleService: PeopleService) {
    @GetMapping("/peoples/{id}")
    fun getPeople(@PathVariable id: Long): ResponseEntity<Optional<People>> {
        val people = peopleService.getPeople(id)
        println(people)
        return ResponseEntity.status(200).body(people)
    }

    @GetMapping("/peoples")
    fun getPeopleAll(): ResponseEntity<List<People>> {
        val people = peopleService.getPeopleAll()
        println(people)
        return ResponseEntity.status(200).body(people)
    }

    @PostMapping("/peoples")
    fun savePeople(@RequestBody people:People): ResponseEntity<People> {
        val people=peopleService.savePeople(people)
        return ResponseEntity.status(200).body(people)
    }

//    @PutMapping("/peoples/{id}")
//    fun updatePeople(@PathVariable id: Long, @RequestBody people: People): ResponseEntity<People> {
//        println(people)
//        val updatePeople=peopleService.updatePeople(id, people)
//        return ResponseEntity.status(200).body(updatePeople)
//    }

    @DeleteMapping("/peoples/{id}")
    fun deletePeople(@PathVariable id: Long): ResponseEntity<Unit> {
        peopleService.deletePeople(id)
        return ResponseEntity.status(201).build()
    }
}