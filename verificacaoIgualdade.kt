fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakeséare", "Hemingway")

    println(authors == writers)
    println(authors === writers)
}