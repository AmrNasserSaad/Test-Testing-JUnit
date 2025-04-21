package org.example


class RestaurantOrderService(
    private val logger: Logger,
    private val dataBase: DataBase
) {


    fun addOrder(order: String) {
        if (order.isBlank()) {
            logger.log("failed to log")
            throw IllegalArgumentException()
        }
        val insertResult = dataBase.insertOrder(order)

        when {
            insertResult.isSuccess -> showMessage("Success")
            insertResult.isFailure -> showMessage("Failed")
        }
    }

    private fun showMessage(message: String) {
        println(message)
    }

    fun getOrders(): List<String> = dataBase.queryOrders()

    fun clearOrders() = dataBase.deleteAllOrders()
}