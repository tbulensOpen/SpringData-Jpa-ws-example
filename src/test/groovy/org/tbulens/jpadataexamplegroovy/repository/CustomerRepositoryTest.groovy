package org.tbulens.jpadataexamplegroovy.repository

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.tbulens.jpadataexamplegroovy.model.Customer
import org.tbulens.jpadataexamplegroovy.model.CustomerBuilder
import org.tbulens.jpadataexamplegroovy.model.CustomerOrder

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired CustomerRepository customerRepository
    @Autowired CustomerOrderRepository customerOrderRepository

    @Test
    void save() {
        Customer customer = CustomerBuilder.build()
        Customer savedCustomer = customerRepository.save(customer)
        assert savedCustomer.customerId
    }

    @Test
    void findById() {
        Customer customer = CustomerBuilder.build()
        Customer savedCustomer = customerRepository.save(customer)
        Customer findCustomer = customerRepository.findById(savedCustomer.customerId).get()
        assert findCustomer.customerId == savedCustomer.customerId
    }

    @Test
    void saveWithCustomerOrder() {
        Customer customer = CustomerBuilder.buildWithCustomerOrders()

        Customer savedCustomer = customerRepository.save(customer)
        CustomerOrder savedCustomerOrder = savedCustomer.customerOrders[0]
        assert savedCustomerOrder.customerOrderId
    }
}
