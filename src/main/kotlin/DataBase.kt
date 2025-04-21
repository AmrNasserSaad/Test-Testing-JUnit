package org.example

interface DataBase {

    fun queryOrders() : List<String>

    fun insertOrder(order :String) :Result<String>

    fun deleteAllOrders()

}