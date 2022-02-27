object ErrorHandling extends App {
	val text = ""
	try {
		1 / 0
	} catch {
		case err: ArithmeticException => System.err.println("समझ गया मैं ।" + err)
		case _: Throwable => println("Chill!")
	}
	try {
		throw new Error("Hi")
	} catch {
		case err: ArithmeticException => System.err.println("समझ गया मैं ।" + err)
		case _: Throwable => println("Chill!")
	}
}