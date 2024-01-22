package org.tbulens.jpadataexamplegroovy.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "Customer")
class Customer implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="customerId")
  Long customerId

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
  Set<CustomerOrder> customerOrders = []

  @Column(length=25, unique=false, nullable=false)
  String firstName

  @Column(length=25, unique=false, nullable=false)
  String lastName
}
