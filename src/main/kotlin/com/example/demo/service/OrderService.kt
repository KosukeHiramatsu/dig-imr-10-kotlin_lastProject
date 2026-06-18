package com.example.demo.service

import com.example.demo.controller.Order
import com.example.demo.controller.SaveOrderRequest


interface OrderService {
    fun getOrder(id: Long): Order?
    fun getOrderAll(): List<Order>?
    fun saveOrder(request: SaveOrderRequest): Order
    fun updateOrder(id:Long, order: Order): Order?
    fun deleteOrder(id: Long): Unit
}