package io.github.vikeshpandey.serialize;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<Address> addresses;

    public Employee(final int id, final String name, final List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "[id = " + id + ", name = " + name + ", address = [" + addresses + "]]";
    }
}
