package com.first.api.book

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {

    @GetMapping("/books")
    fun getAllBooks(): List<BookResponse> {
        return listOf(BookResponse(id = 1, title = "Mistborn", author = "Brandon Sanderson"),
                      BookResponse(id = 2, title = "Well of Ascension", author = "Brandon Sanderson"),
                      BookResponse(id = 3, title = "Hero of Ages", author = "Brandon Sanderson"))
    }

    @GetMapping("/books/{id}")
    fun getBookById(@PathVariable id: Int ): BookResponse {
        return BookResponse(id = id, title = "Mistborn", author = "Brandon Sanderson")
    }
}

data class BookResponse(
    val id: Int,
    val title: String,
    val author: String,
)
