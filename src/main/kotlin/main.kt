import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

     print("Enter an email: ")

     var str : String = input.next()

    when(str.contains("@")) {
        true -> print("Verified")
        false -> print("Can't verified")
    }


}