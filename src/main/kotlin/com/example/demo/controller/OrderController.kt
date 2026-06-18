package com.example.demo.controller

import com.example.demo.service.OrderService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

data class Order(val id: Long=0, val name: String)
data class SaveOrderRequest(val name: String)

@RestController
class OrderController(private val orderService: OrderService) {
    @GetMapping("/orders/{id}")
    fun getOrder(@PathVariable id: Long): ResponseEntity<Order> {
        val order = orderService.getOrder(id)
        println(order)
        return ResponseEntity.status(200).body(order)
    }

    @GetMapping("/orders")
    fun getOrderAll(): ResponseEntity<List<Order>> {
        val order = orderService.getOrderAll()
        println(order)
        return ResponseEntity.status(200).body(order)
    }

    @PostMapping("/orders")
    fun saveOrder(@RequestBody request: SaveOrderRequest): ResponseEntity<Order> {
        val order=orderService.saveOrder(request)
        return ResponseEntity.status(200).body(order)
    }

    @PutMapping("/orders/{id}")
    fun updateOrder(@PathVariable id: Long, @RequestBody order: Order): ResponseEntity<Order> {
        println(order)
        val updateOrder=orderService.updateOrder(id, order)
        return ResponseEntity.status(200).body(updateOrder)
    }

    @DeleteMapping("/orders/{id}")
    fun deleteOrder(@PathVariable id: Long): ResponseEntity<Unit> {
        orderService.deleteOrder(id)
        return ResponseEntity.status(201).build()
    }
}