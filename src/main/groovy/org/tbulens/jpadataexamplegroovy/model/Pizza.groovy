package org.tbulens.jpadataexamplegroovy.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "Pizza")
class Pizza {

    @Id
    @Column(name="pizzaCode", length = 10)
    String pizzaCode

    @Column(length = 25)
    String name

    @Column(length = 512)
    String description

    @Column(name = "cost", length = 6)
    String cost
}
