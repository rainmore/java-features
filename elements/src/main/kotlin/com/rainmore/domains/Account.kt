package com.rainmore.domains

import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "accounts")
class Account : Model {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @Id
    var id: Long? = null

    @Column
    var firstName: String? = null

    @Column
    var lastName: String? = null

    @Column
    var email: String? = null

    @Column
    var active: Boolean? = null

    @Column(updatable = false)
    @NotNull
    var createdAt: LocalDateTime? = null

    @Column
    @NotNull
    var updatedAt: LocalDateTime? = null

    @PrePersist
    fun prePersist() {
        if (createdAt == null) createdAt = LocalDateTime.now()
        if (updatedAt == null) updatedAt = createdAt
    }

    @PreUpdate
    fun preUpdate() {
        updatedAt = LocalDateTime.now()
    }
}