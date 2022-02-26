object Hello extends App {
	if (args.size < 1)
		println("Hello, World!")
	else
		println(s"Hello, ${args(0)}!")
}