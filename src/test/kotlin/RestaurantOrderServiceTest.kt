import io.mockk.mockk
import io.mockk.verify
import org.example.DataBase
import org.example.Logger
import org.example.RestaurantOrderService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class RestaurantOrderServiceTest {
    private lateinit var restaurantOrderService: RestaurantOrderService
    private val dataBase: DataBase = mockk(relaxed = true)

    @BeforeEach
    fun setup() {
        val dummyLogger: Logger = mockk()
        restaurantOrderService = RestaurantOrderService(dummyLogger, dataBase)
    }


    // use mock
    @Test
    fun `clearOrders should delete all orders from database when called`() {
        //When
        restaurantOrderService.clearOrders()

        //Then
        verify { dataBase.deleteAllOrders() }
    }


    @Test
    fun `getOrders should return empty list when no orders added`() {
        val orders = restaurantOrderService.getOrders()
        assertTrue(orders.isEmpty())
    }

    @Test
    fun `getOrders should return when all added orders`() {
        restaurantOrderService.addOrder("Pizza")
        restaurantOrderService.addOrder("Burger")

        val orders = restaurantOrderService.getOrders()

        assertEquals(2, orders.size)
        assertTrue(orders.contains("Pizza"))
        assertTrue(orders.contains("Burger"))
    }

    @Test
    fun `addOrder should add valid order to the list`() {
        restaurantOrderService.addOrder("Salad")
        val orders = restaurantOrderService.getOrders()

        assertEquals(1, orders.size)
        assertEquals("Salad", orders[0])
    }

    @Test
    fun `addOrder should throw exception when order is blank`() {
        assertThrows<IllegalArgumentException> {
            restaurantOrderService.addOrder("")
        }
    }

    @Test
    fun `clearOrders should remove all orders`() {
        restaurantOrderService.addOrder("Pasta")
        restaurantOrderService.addOrder("Steak")

        restaurantOrderService.clearOrders()
        val orders = restaurantOrderService.getOrders()

        assertTrue(orders.isEmpty())
    }

}