package org.example



class RestaurantOrderService(
   private val logger: Logger
) {

    private val orders = mutableListOf<String>()

    fun addOrder(order: String) {
        if (order.isBlank()) {
            throw IllegalArgumentException()
        }
        orders.add(order)
    }

    fun getOrders(): List<String> = orders.toList()

    fun clearOrders() = orders.clear()
}