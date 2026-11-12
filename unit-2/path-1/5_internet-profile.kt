fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?
) {
    val referrerInfo: String
        get() = if (referrer != null) {
            "Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}."
        } else {
            "Doesn't have a referrer."
        }

    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby. $referrerInfo")
        print("\n\n")
    }
}