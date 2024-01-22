package org.tbulens.jpadataexamplegroovy.model

import com.github.javafaker.Faker

class CustomerBuilder {
    static Faker faker = new Faker()

//    String streetName = faker.address().streetName();
//    String number = faker.address().buildingNumber();
//    String city = faker.address().city();
//    String country = faker.address().country();

    static Customer build() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        build(firstName, lastName)
    }

    static Customer build(String firstName, String lastName) {
        new Customer(firstName: firstName, lastName: lastName)
    }

    static Customer buildWithCustomerOrders() {
        Customer customer = build()
        CustomerOrderBuilder.build(customer)
        customer
    }
}
