
import io.StdIn._

println("Hello User,Enter you Numbere in your mind:")

val num = readInt

(num%3,num%5) match {

	case (0,0) => println("Fizz Buzz !")
	case (_,0) => println("Fizz !")
	case (0,_) => println("Buzz !")
	case (_,_) => println("Wrong Input !")	
}
