package io.github.vikeshpandey.serialize;

public class Address {
    private String city;

    public Address(final String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "city = " + city;
    }
}
