fun main() {
val livro1 = Book(
title = "Grande Sertão: Veredas",
author = "João Guimarâes Rosa",
publicationYear = 1956
        )
val livro2 = Book(
title = "Minha vida de menina",
author = "Helena Morley",
publicationYear = 1942,
        company = "Editora"
)
val livro3 = Book(
title = "Memórias póstumas de Bras Cubas",
author = "Machado de Assis",
publicationYear = 1881
)
val livro4 = Book(
title = "Iracema",
author = "JOsé de Alencar",
publicationYear = 1861,
        company = "Editora B"
)
val livros: MutableList<Book> = mutableListOf(livro1, livro2, livro3, livro4)
livros.add(
Book(
        title = "Sagarana",
author = "João Guimarães Rosa",
publicationYear = 1946
)
)
livros.imprimeComMarcadores()
        livros.remove(livro1)
        livros.imprimeComMarcadores()
        val ordenadoPorAno:List<Book> =livros.sorted()
        ordenadoPorAno.imprimeComMarcadores()
        val ordenadoPorTitulo:List<Book>  = livros.sortedBy {it.title  }
ordenadoPorTitulo.imprimeComMarcadores()
livros.sortedBy {it.author  }.imprimeComMarcadores()
val titulos: List<String> = livros
        .filter {it.author.startsWith("J")  }
        .sortedBy {it.publicationYear  }
        .map { it.title }
        println(titulos)
} // main

fun List<Book>.imprimeComMarcadores() {
val textoFormatado = this.joinToString(separator = "\n") {
" - ${it.title} de ${it.author}"
}
        println(" ### Lista de livros ### \n$textoFormatado")
        }
