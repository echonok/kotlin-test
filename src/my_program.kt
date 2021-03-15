fun main(args: Array<String>) {
    val firstName: String? = readLine();
    val lastName: String? = readLine();
    println("Hello ${firstName} ${lastName}!");
}

fun calcChairs(bugs: Int): Int {
    return bugs + bugs/2;
}