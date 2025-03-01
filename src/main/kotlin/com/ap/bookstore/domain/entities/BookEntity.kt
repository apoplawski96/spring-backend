package com.ap.bookstore.domain.entities

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "books")
data class BookEntity(
    @Id
    val isbn: String,

    val title: String,

    val description: String,

    val image: String,

    @ManyToOne(cascade = [CascadeType.DETACH])
    @JoinColumn(name = "author_id")
    val authorEntity: AuthorEntity,
)