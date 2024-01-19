package org.tbulens.jpadataexamplegroovy.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="customerId")
  Long customerId

  @Column(length=25, unique=false, nullable=false)
  String firstName

  @Column(length=25, unique=false, nullable=false)
  String lastName
}
