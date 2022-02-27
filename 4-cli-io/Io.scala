import scala.io.StdIn.readLine

object Io extends App {
	print("Name: ")
	val name = readLine()

	println(s"Hello, $name!")
}