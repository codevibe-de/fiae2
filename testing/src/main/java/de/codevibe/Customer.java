package de.codevibe;

public class Customer {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private double balance;

    public Customer(long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public long getId() {
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return firstName + lastName;
    }

    public boolean isAdult() {
        return age > 18;
    }

    public void deposit(double amount) {
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        return true;
    }
}
