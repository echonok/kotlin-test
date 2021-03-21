class NibirunianClass () {
    public var namePlate: String = ""
    public fun createNamePlate (name: String): void {
        namePlate = "Live long and prosper, $name";
    }
}

fun main(args: Array<String>) {
    val str: String? = readLine();
//    if (str !== null) {
//        val sum = calculateEvenDigits(str);
//        println("sum = ${sum}");
//    }

    if (str !== null) {
        val split = str.split(" ");
        calculateBugMentions(split);
    }

}

fun calculateEvenDigits(input:String): Int {
    var sum = 0;
    for(i in input) {
        val int = i.toString().toInt();
        if (int % 2 === 0) sum += int
    }
    return sum;
}

fun calcChairs(bugs: Int): Int {
    return bugs + bugs/2;
}

fun calculateBugMentions(input:List<String>): Int{
    return input.filter { word -> word.contains("BUG", true) }.size;
}


fun getYearEra(year:Int) = when {
    year < 1970  -> "before"
    year === 1970 -> "equals"
    year in 1971..1999 -> "after(XX century)"
    year in 2000..2099 -> "after (XXI century)"
    else -> "distant future"
}