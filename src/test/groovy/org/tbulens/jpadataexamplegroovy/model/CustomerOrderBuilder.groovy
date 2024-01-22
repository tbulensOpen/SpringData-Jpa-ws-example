package org.tbulens.jpadataexamplegroovy.model

class CustomerOrderBuilder {

    static Customer build(Customer customer) {
        CustomerOrder co = new CustomerOrder(customer: customer)
        customer.customerOrders << co
        customer
    }
}
