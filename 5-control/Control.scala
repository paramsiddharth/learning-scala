import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object Control extends App {
	print("Enter your name: ")
	val name = readLine()

	if (name == "Jay") {
		System.err.println("You're not allowed here.")
		System.exit(1);
	}

	val greeting = if (name == "Param") s"Salaam Namaste!" else s"Welcome, $name!"
	println(greeting)

	val seq = Seq(1, 2, 3)
	for (n <- seq) println(n)
	val list: Seq[Int] = List(1, 2, 3)
	for (n <- list) println(n)

	val people = Map(
		"Param" -> 20,
		"Henry" -> 15
	)
	for ((name, age) <- people) println(s"$name ($age)")

	println("Choose a number between 1-3: ")
	val num = readInt()

	num match {
		case num if 1 to 3 contains num => println("Good.")
		case _ => println("बुद्धू")
	}

	num match {
		case 1 => println("Small.")
		case 2 => println("Medium.")
		case 3 => println("Large.")
		case _ => println("None.")
	}

	def boolToStr(x: Boolean): String = {
		if (x) "सत्य" else "झूठ"
	}

	val b = true
	println(s"$b: ${boolToStr(b)}")
	println(s"${!b}: ${boolToStr(!b)}")

	def isTrue(x: Any): Any = x match {
		case 0 | "" => false
		case x if x == "TRUETRUETRUE" => "2ru"
		case _ => true
	}

	println(isTrue(""))
	println(isTrue("TRUETRUETRUE"))
	println(isTrue(false)) // true (LOL)
}