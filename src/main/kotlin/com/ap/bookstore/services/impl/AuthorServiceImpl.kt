package com.ap.bookstore.services.impl

import com.ap.bookstore.domain.entities.AuthorEntity
import com.ap.bookstore.repositories.AuthorRepository
import com.ap.bookstore.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository) : AuthorService {

    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }
}