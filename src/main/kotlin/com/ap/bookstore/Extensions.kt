package com.ap.bookstore

import com.ap.bookstore.domain.dto.AuthorDto
import com.ap.bookstore.domain.dto.BookDto
import com.ap.bookstore.domain.entities.AuthorEntity
import com.ap.bookstore.domain.entities.BookEntity

fun AuthorEntity.toAuthorDto() = AuthorDto(
    id = id,
    name = name,
    age = age,
    description = description,
    image = image
)

fun BookEntity.toBookDto() = BookDto(
    isbn = isbn,
    title = title,
    description = description,
    image = image,
    author = authorEntity.toAuthorDto()
)

fun AuthorDto.toAuthorEntity() = AuthorEntity(
    id = id,
    name = name,
    age = age,
    description = description,
    image = image
)

fun BookDto.toBookEntity() = BookEntity(
    isbn = isbn,
    title = title,
    description = description,
    image = image,
    authorEntity = author.toAuthorEntity()
)