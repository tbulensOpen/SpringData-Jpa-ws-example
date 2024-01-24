package org.tbulens.jpadataexamplegroovy.model

class PizzaBuilder {

    static Pizza build() {
        new Pizza(name: "All Meat", pizzaCode: "AllMeat", cost: "18.25", description: "All Meat includes Sausage, hamburger, pepperoni")
    }
}
