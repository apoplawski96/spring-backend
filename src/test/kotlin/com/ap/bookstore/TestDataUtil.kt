package com.ap.bookstore

import com.ap.bookstore.domain.dto.AuthorDto
import com.ap.bookstore.domain.entities.AuthorEntity

fun testAuthorDtoA(id: Long? = null) = AuthorDto(
    id = id,
    name = "name",
    age = 30,
    description = "some desc",
    image = "image.png"
)

fun testAuthorEntityA(id: Long? = null) = AuthorEntity(
    id = id,
    name = "name",
    age = 30,
    description = "some desc",
    image = "image.png"
)