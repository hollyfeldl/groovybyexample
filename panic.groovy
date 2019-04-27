//  https://gobyexample.com/panic

void doPanic() {

	// throw a custom exception
	throw new Exception("a problem")

}

void main() {

	try {

		doPanic()

	} catch (Exception ae) {
		println ae.toString()
	}

}

//run it

main() 