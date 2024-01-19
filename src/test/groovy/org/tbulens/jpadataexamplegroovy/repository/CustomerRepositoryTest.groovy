package org.tbulens.jpadataexamplegroovy.repository

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.tbulens.jpadataexamplegroovy.model.Customer
import org.tbulens.jpadataexamplegroovy.model.CustomerBuilder

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired CustomerRepository customerRepository

    @Test
    void save() {
        Customer customer = CustomerBuilder.build()
        Customer savedCustomer = saveCustomer(customer)
        assert savedCustomer.customerId
    }

    @Test
    void findById() {
        Customer customer = CustomerBuilder.build()
        Customer savedCustomer = saveCustomer(customer)
        Customer findCustomer = customerRepository.findById(savedCustomer.customerId).get()
        assert findCustomer.customerId == savedCustomer.customerId
    }

    private Customer saveCustomer(Customer customer) {
        customerRepository.save(customer)
    }
}
