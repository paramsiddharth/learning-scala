object Strings extends App {
	val firstName = "Param"
	val lastName = "Siddharth"

	val fullName = s"$firstName $lastName"
	println(fullName)

	println(s"1 + 1 = ${1 + 1}")

	val text = """I
				 |am
				 |text
				 |spanning
				 |multiple
				 |lines.""".stripMargin
	println(text)
}