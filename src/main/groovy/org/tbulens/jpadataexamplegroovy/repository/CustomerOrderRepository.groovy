package org.tbulens.jpadataexamplegroovy.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.tbulens.jpadataexamplegroovy.model.Customer
import org.tbulens.jpadataexamplegroovy.model.CustomerOrder

@Repository
interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long> {

//    List<CustomerOrder> saveAll(Set<CustomerOrder> customerOrders)
    Optional<CustomerOrder> findById(Long customerOrderId)
}