package de.codevibe;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;




@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer(42L, "Jane", "Doe", 30);
    }

    @Test
    @Order(1)
    void constructorSetsBasicFields() {
        assertEquals("Jane", customer.getFirstName());
        assertEquals("Doe", customer.getLastName());
        assertEquals(30, customer.getAge());
    }

    @Test
    @Order(2)
    void getIdReturnsId() {
        assertEquals(42L, customer.getId());
    }

    @Test
    @Order(3)
    void getFullNameReturnsCombinedName() {
        assertEquals("Jane Doe", customer.getFullName());
    }

    @Test
    @Order(4)
    void isAdultReturnsTrueForAdult() {
        assertTrue(customer.isAdult());
    }

    @Test
    @Order(5)
    void isAdultReturnsTrueAtExactlyEighteen() {
        Customer youngAdult = new Customer(1L, "Max", "Muster", 18);
        assertTrue(youngAdult.isAdult());
    }

    @Test
    @Order(6)
    void isAdultReturnsFalseForMinor() {
        Customer minor = new Customer(2L, "Tim", "Test", 17);
        assertFalse(minor.isAdult());
    }

    @Test
    @Order(7)
    void depositIncreasesBalance() {
        customer.deposit(100.0);
        assertEquals(100.0, customer.getBalance());
    }

    @Test
    @Order(8)
    void depositAccumulatesMultipleDeposits() {
        customer.deposit(50.0);
        customer.deposit(30.0);
        assertEquals(80.0, customer.getBalance());
    }

    @Test
    @Order(9)
    void withdrawReducesBalance() {
        customer.deposit(100.0);
        customer.withdraw(40.0);
        assertEquals(60.0, customer.getBalance());
    }

    @Test
    @Order(10)
    void withdrawReturnsFalseWhenInsufficientFunds() {
        customer.deposit(20.0);
        boolean result = customer.withdraw(50.0);
        assertFalse(result);
        assertEquals(20.0, customer.getBalance()); // balance must be unchanged
    }

    @Test
    @Order(11)
    void withdrawReturnsTrueOnSuccess() {
        customer.deposit(100.0);
        boolean result = customer.withdraw(100.0);
        assertTrue(result);
    }
}
