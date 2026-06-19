package com.example.demo

import com.example.demo.entity.People
import com.example.demo.testDouble.SpyPeopleService
import com.example.demo.controller.PeopleController
//import com.example.demo.fakeRepository.FakeSqlOrderRepository
//import com.example.demo.service.PeopleService
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class TestController {
    val spy= SpyPeopleService()
    val spyController=PeopleController(spy)

@Test
fun countTest(){
    spyController.getPeople(1)
    assertEquals(1, spy.countGetPeople)
}

//@Test
//fun getPeopleTest(){
//    val result=spyController.getPeople(1)
//    assertEquals(People(1,"太郎", "日本"), result)
//}
// check(spyController.getPeople(1) == People(1,"太郎", "日本")) { "id 1 で 太郎 が返ることを期待しますが: ${spyController.getPeople(1)}" }
// println("getPeople完了")

// repoCheck.save(checkOrder1)
// repoCheck.save(checkOrder2)
// check(repoCheck.findById(4) == Order(4, "進次郎")) { "id 4 で 進次郎 が返ることを期待しますが: ${repoCheck.findById(4)}" }
// println("save完了")
//
// check(repoCheck.findAll()?.size == 5) { "保存された注文が5件であることを期待しますが: ${repoCheck.getAll()?.size}" }
// println("findAll完了")
//
// repoCheck.update(1, checkUpdateOrder1)
// check(repoCheck.findById(1) == checkUpdateOrder1) { "id 1 で checkOrder1 が返ることを期待しますが: ${repoCheck.findById(1)}" }
// println("Update完了")
//
// repoCheck.delete(1)
// check(repoCheck.findById(1) == null) { "id 1 で null が返ることを期待しますが: ${repoCheck.findById(1)}" }
// println("Delete完了")
}