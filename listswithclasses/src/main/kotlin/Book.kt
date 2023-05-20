data class Book(
val title: String,
val author: String,
val publicationYear: Long,
    val company: String? = null
): Comparable<Book> {
    override fun compareTo(other: Book): Int {
return this.publicationYear.compareTo(other.publicationYear)
    }
} // Book
