package Passanger;

import flight.Flight;

import java.util.List;

public class Passanger {
    private String name;
    private String surname;
    private String dateOfBirth;
    private List<Flight> flights;

    public Passanger(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
