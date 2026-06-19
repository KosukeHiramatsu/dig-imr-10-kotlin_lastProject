package com.example.demo.testDouble

import com.example.demo.entity.People
import com.example.demo.repository.PeopleRepository
import com.example.demo.service.PeopleService
import java.util.Optional


class SpyPeopleService(): PeopleService {
    var countGetPeople:Int=0

    override fun getPeople(id: Long): People{
        val returnPeople=People(id,"太郎", "日本")
        countGetPeople++
        return returnPeople
    }
    override fun getPeopleAll(): List<People>?{
        val returnPeople1=People(1,"田中", "日本")
        val returnPeople2=People(2,"田中", "ブラジル")
        val returnPeople3=People(3,"田中", "南極")

        val returnArray=listOf<People>(returnPeople1,returnPeople2,returnPeople3)
        return returnArray
    }
    override fun savePeople(people:People): People{
        return People(4,"太郎", "日本")
    }
    //    fun updatePeople(id:Long, people: People): People?
    override fun deletePeople(id: Long){

    }
}