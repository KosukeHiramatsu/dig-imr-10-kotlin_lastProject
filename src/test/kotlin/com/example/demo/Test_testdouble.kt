package com.example.demo

import com.example.demo.controller.Order
import com.example.demo.controller.SaveOrderRequest
import com.example.demo.fakeRepository.FakeSqlOrderRepository

fun main() {
 val repoCheck = FakeSqlOrderRepository()
 val checkOrder1 = SaveOrderRequest("進次郎")
 val checkOrder2 = SaveOrderRequest("Hiroshi")
 val checkUpdateOrder1 = Order(1,"花子")

 check(repoCheck.findById(1) == Order(1,"太郎")) { "id 1 で 太郎 が返ることを期待しますが: ${repoCheck.findById(1)}" }
 println("findById完了")

 repoCheck.save(checkOrder1)
 repoCheck.save(checkOrder2)
 check(repoCheck.findById(4) == Order(4, "進次郎")) { "id 4 で 進次郎 が返ることを期待しますが: ${repoCheck.findById(4)}" }
 println("save完了")

 check(repoCheck.getAll()?.size == 5) { "保存された注文が5件であることを期待しますが: ${repoCheck.getAll()?.size}" }
 println("getAll完了")

 repoCheck.update(1, checkUpdateOrder1)
 check(repoCheck.findById(1) == checkUpdateOrder1) { "id 1 で checkOrder1 が返ることを期待しますが: ${repoCheck.findById(1)}" }
 println("Update完了")

 repoCheck.delete(1)
 check(repoCheck.findById(1) == null) { "id 1 で null が返ることを期待しますが: ${repoCheck.findById(1)}" }
 println("Delete完了")
}