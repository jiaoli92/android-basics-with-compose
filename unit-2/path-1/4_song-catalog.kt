fun main() {
    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()
    println(brunoSong.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: String,
    val playCount: Int
) {
    // val isPopular: Boolean = playCount > 1000
    val isPopular: Boolean
        get() = playCount >= 1000

    // methods
    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}