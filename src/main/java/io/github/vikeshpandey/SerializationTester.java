package io.github.vikeshpandey;

import com.google.gson.Gson;
import io.github.vikeshpandey.serialize.Address;
import io.github.vikeshpandey.serialize.Employee;

import java.util.ArrayList;
import java.util.List;

public class SerializationTester {

    public static void main(String[] args) {
        Address temporaryAddress = new Address("New York");
        Address permanentAddress = new Address("New Jersey");
        List<Address> addresses = new ArrayList<Address>(2);
        addresses.add(temporaryAddress);
        addresses.add(permanentAddress);

        Employee employee = new Employee(1, "John Doe", addresses);

        Gson gson = new Gson();
        String json = gson.toJson(employee);
        System.out.println("json string is : " + json);

        Employee convertedFromJson = gson.fromJson(json, Employee.class);
        System.out.println("Employee object created from json : " + convertedFromJson);
    }
}
