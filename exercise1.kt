import java.util.Scanner
import java.util.Arrays

val handshake = arrayOf("wink", "double blink", "close your eyes", "jump")

fun secret(num:Int): String
{
    var slice = arrayOf<String>()
    for (i in 0 until handshake.size)
    {
        var result:Int = num and (1 shl i)
        if (result != 0)
        {
            slice = slice.plus(handshake[i])
        }
        if ((num and (1 shl 4)) != 0)
        {
            slice.reverse()
        }
    }
    return Arrays.toString(slice)
}

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter a decimal number for secret handshake: ")
    var num = sc.nextInt()
    val result = secret(num)
    println(result)
}