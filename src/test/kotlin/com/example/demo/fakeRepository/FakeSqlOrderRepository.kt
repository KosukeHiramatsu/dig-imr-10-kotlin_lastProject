package com.example.demo.fakeRepository
//基礎要件はこちらです
//import com.example.demo.controller.Order
//import com.example.demo.controller.SaveOrderRequest
//import com.example.demo.repository.PeopleRepository
//import org.springframework.stereotype.Repository
//
//@Repository
//class FakeSqlOrderRepository : PeopleRepository {
//
//    val initData = listOf(
//        Order(1, "太郎"),
//        Order(2, "こじろう"),
//        Order(3, "ひろし")
//    )
//    val fakeDatabase = initData.associateBy { it.id }.toMutableMap()
//
//    override fun findById(id: Long): Order? {
//        println(id)
//        return fakeDatabase[id]
//    }
//
//    override fun getAll(): List<Order>? {
//        val result = fakeDatabase.values.toList()
//        val result1 = fakeDatabase.keys.toList()
//        println(result1)
//        println(fakeDatabase)
//        return result
//    }
//
//    override fun save(request: SaveOrderRequest): Order {
//        val newId: Long = (fakeDatabase.keys.maxOrNull() ?: 0L) + 1L
//        val newOrder = Order(newId, request.name)
//        fakeDatabase[newOrder.id] = newOrder
//        return newOrder
//    }
//    override fun update(id:Long, order:Order): Order? {
//        println(order)
//        val updateData = Order(id=id, name=order.name)
//        fakeDatabase[id]=updateData
//
//        return updateData
//    }
//    override fun delete(id: Long): Unit {
//        fakeDatabase.remove(id)
//    }
//}