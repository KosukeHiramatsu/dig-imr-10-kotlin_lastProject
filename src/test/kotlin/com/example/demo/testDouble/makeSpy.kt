package com.example.demo.testDouble

import com.example.demo.entity.People
import com.example.demo.repository.PeopleRepository
import com.example.demo.service.PeopleService
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class SpyPeopleService(private val peopleRepository: PeopleRepository): PeopleService {
    val

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