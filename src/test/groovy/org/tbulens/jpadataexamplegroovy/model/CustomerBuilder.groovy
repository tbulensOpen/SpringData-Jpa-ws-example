package org.tbulens.jpadataexamplegroovy.model

class CustomerBuilder {
//    Faker faker = new Faker()

//    String streetName = faker.address().streetName();
//    String number = faker.address().buildingNumber();
//    String city = faker.address().city();
//    String country = faker.address().country();

    static build() {
        build("firstName", "lastName")
    }
    static build(String firstName, String lastName) {
        new Customer(firstName: firstName, lastName: lastName)
    }
}
