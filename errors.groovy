// errors example
// https://gobyexample.com/errors

//Groovy uses exceptions instead of the error type used in Go. 
// as such, the example is executed a bit different but the goal is 
// to show similar features


Integer f1(Integer arg) {

	if (arg == 42) {
		throw new RuntimeException("Cannot work with 42") 
	}
	return arg + 3

}

class ArgErrorException extends Exception {
	// parameterless constructor
	public ArgErrorException() {}

	// constructor that accepts a message
	public ArgErrorException(String message) {
		super (message)
	}

	// support for exception chaining
	public ArgErrorException(Throwable cause) {
		super (cause)
	}

	// support for exception chaining
	public ArgErrorException(String message, Throwable cause) {
		super (message, cause)
	}

}

Integer f2(Integer arg) {
	if (arg == 42) {
		throw new ArgErrorException("Cannot work with it")
	}
	return arg + 3
}

void main() {

	// use delivered exception
	for (Integer i in [7,42]) {
		try {
			println "f1 worked: ${f1(i)}"
		} catch (Exception e1 ) {
			println "f1 failed: ${e1.getCause()} -- ${e1.getMessage()} (${e1.toString()})"
		}
	}

	// use a custom exception
	for (Integer i in [7,42]) {
		try {
			println "f2 worked: ${f2(i)}"
		} catch (Exception e2 ) {
			println "f2 failed: ${e2.getCause()} -- ${e2.getMessage()} (${e2.toString()})"
		}
	}

	try{
		dummy = f2(42)
	} catch (Exception ae) {
		println ae.getCause()
		println ae.getMessage()
		println ae.toString()
		ae.printStackTrace()
	}

}

// run in
main()

