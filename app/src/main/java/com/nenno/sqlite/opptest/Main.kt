package com.nenno.sqlite.opptest

    fun main() {
        val library = Library()

        library.addBook("Dom Caramujo", "Juquinha do Pneu")
        library.addBook("Senhor Salsicha", "Scooby Do")
        library.addBook("Capitão Ásia", "Maravel Laravel")

        library.listBooks()

        library.doBookLoan("Capitão Ásia")
        library.doBookLoan("Capitão América")

        library.listBooks()

        library.doBookDevolution("Capitão América")
        library.doBookDevolution("Capitão Ásia")

        library.listBooks()
    }