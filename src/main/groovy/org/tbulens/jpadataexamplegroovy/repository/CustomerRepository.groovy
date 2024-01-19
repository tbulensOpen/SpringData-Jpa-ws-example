package org.tbulens.jpadataexamplegroovy.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.tbulens.jpadataexamplegroovy.model.Customer

@Repository
interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer save(Customer customer)
    Optional<Customer> findById(Long customerId)
}