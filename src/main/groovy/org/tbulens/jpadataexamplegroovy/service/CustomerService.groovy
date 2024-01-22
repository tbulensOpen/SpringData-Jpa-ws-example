package org.tbulens.jpadataexamplegroovy.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.tbulens.jpadataexamplegroovy.model.Customer
import org.tbulens.jpadataexamplegroovy.model.CustomerOrder
import org.tbulens.jpadataexamplegroovy.repository.CustomerRepository

@Service
class CustomerService {

    @Autowired CustomerRepository customerRepository

    Customer save(Customer customer) {
        customerRepository.save(customer)
        customer
    }
}
