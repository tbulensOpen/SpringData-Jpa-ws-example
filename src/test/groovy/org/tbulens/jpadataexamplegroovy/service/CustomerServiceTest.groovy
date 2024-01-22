package org.tbulens.jpadataexamplegroovy.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest
import org.tbulens.jpadataexamplegroovy.model.Customer
import org.tbulens.jpadataexamplegroovy.model.CustomerBuilder
import org.tbulens.jpadataexamplegroovy.model.CustomerOrder;

@SpringBootTest
class CustomerServiceTest {
    @Autowired
    CustomerService customerService

    @Test
    void save_CustomerWithAOrder() {
        Customer customer = CustomerBuilder.buildWithCustomerOrders()
        Customer savedCustomer = customerService.save(customer)
        assert savedCustomer
        assert savedCustomer.customerId
        assert savedCustomer.customerOrders

        CustomerOrder customerOrder = savedCustomer.customerOrders[0]
        assert customerOrder.customerOrderId
        assert customerOrder.customer.customerId
    }

}