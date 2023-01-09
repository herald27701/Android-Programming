import java.util.Scanner

fun triangle(a:Float, b:Float, c:Float)
{
    if (a > 0 && b > 0 && c > 0 && (a+b)>=c && (a+c)>=b && (b+c) >= a)
    {
        if(a==b && b==c) println("This is an equilateral triangle")
        else if(a==b || b==c || c==a) println("This is an isosceles triangle")
        else if((a+b)==c || (a+c)==b || (b+c) == a) println("This is a degenerate triangle")
        else println("This is a scalene triangle")
    }
    else
    {
        println("This is not the scale of a triangle")
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter a decimal number to determine a triangle")
    print("Enter the length of first side: ")
    var l1: Float = sc.nextFloat()
    print("Enter the length of second side: ")
    var l2: Float = sc.nextFloat()
    print("Enter the length of third side: ")
    var l3: Float = sc.nextFloat()
    triangle(l1, l2, l3)
}