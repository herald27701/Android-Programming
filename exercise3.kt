import java.util.Scanner

fun wordCount(phrase:String)
{
    var map = mutableMapOf<String, Int>() //emptyMap<Int, String>()
    var delimiter = ' '
    val parts = phrase.split(delimiter)
    for (i in parts)
    {
        var count:Int = 0
        for (j in 0 until parts.size)
        {
            if (i == parts[j])
            {
                count++
            }
        }
        map.put(i, count)
    }
    map.forEach{
        println("${it.key} : ${it.value}")
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter a phrase to count each word in that phrase: ")
    var phrase = sc.nextLine()
    wordCount(phrase)
}