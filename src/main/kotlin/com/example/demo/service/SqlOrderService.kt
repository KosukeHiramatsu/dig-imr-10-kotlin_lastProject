package com.example.demo.service

import com.example.demo.controller.Order
import com.example.demo.controller.SaveOrderRequest
import com.example.demo.repository.OrderRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
class SqlOrderService(private val orderRepository: OrderRepository): OrderService {
    override fun getOrder(id: Long): Order? {
        return orderRepository.findById(id)
    }
    override fun getOrderAll(): List<Order>? {
        return orderRepository.getAll()
    }
    override fun saveOrder(request: SaveOrderRequest): Order {
        return orderRepository.save(request)
    }
    override fun updateOrder(id: Long, order:Order): Order? {
        return orderRepository.update(id, order)
    }
    override fun deleteOrder(id: Long): Unit {
        orderRepository.delete(id)
    }
}