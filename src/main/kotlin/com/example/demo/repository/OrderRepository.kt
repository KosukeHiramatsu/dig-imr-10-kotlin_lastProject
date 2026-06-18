package com.example.demo.repository

import com.example.demo.controller.Order
import com.example.demo.controller.SaveOrderRequest

interface OrderRepository{
    fun findById(id: Long): Order?
    fun getAll(): List<Order>?
    fun save(request: SaveOrderRequest): Order
    fun update(id: Long, order: Order): Order?
    fun delete(id: Long): Unit
}