package com.example.demo.service

import com.example.demo.entity.People
import com.example.demo.repository.PeopleRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class SqlPeopleService(private val peopleRepository: PeopleRepository): PeopleService {
    override fun getPeople(id: Long): Optional<People> {
        return peopleRepository.findById(id)
    }
    override fun getPeopleAll(): List<People>? {
        return peopleRepository.findAll()
    }
    override fun savePeople(people:People): People {
        return peopleRepository.save(people)
    }
//    override fun updatePeople(id: Long, people:People): People? {
//        return peopleRepository.
//    }
    override fun deletePeople(id: Long): Unit {
        peopleRepository.deleteById(id)
    }
}