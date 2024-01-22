package org.tbulens.jpadataexamplegroovy.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "CustomerOrder")
class CustomerOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customerOrderId")
    Long customerOrderId

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="customerId", referencedColumnName = "customerId")
    Customer customer

}
