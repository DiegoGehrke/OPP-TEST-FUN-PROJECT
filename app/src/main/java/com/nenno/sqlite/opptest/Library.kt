package com.nenno.sqlite.opptest

import java.util.Objects

class Library {
    private val books: MutableList<Book> = mutableListOf()

    fun addBook(title: String, author: String) {
        val book = Book(title, author)
        books.add(book)
    }

    fun listBooks() {
        if (books.isEmpty()) {
            println("There are no books registered in our library.")
        } else {
            println("Registered books in library:")
            for (book in books) {
                println("- Title: ${book.title}, Author: ${book.author}, Available: ${book.available}")
            }
        }
    }

    fun doBookLoan(title: String) {
        val book = searchBookByTitle(title)
        if (book != null) {
            if (book.available) {
                book.available = false
                println("Loan successfully completed!.")
            } else {
                println("The book is not available for loan.")
            }
        } else {
            println("Book not found.")
        }
    }

    fun doBookDevolution(title: String) {
        val book = searchBookByTitle(title)
        if (book != null) {
            if (!book.available) {
                book.available = true
                println("Book returned successfully.")
            } else {
                println("The book is already available.")
            }
        } else {
            println("Book not found.")
        }
    }

    private fun searchBookByTitle(title: String): Book? {
        return books.find { it.title == title }
    }
}