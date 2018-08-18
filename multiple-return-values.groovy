// the multi return example
// https://gobyexample.com/multiple-return-values


def vals() {
	return [ val1: 3, val2: 7]
}

def main() {

	// Groovy does not support returning multiple values so simulate by returning a map

	def ab = vals()
	println ab.val1
	println ab.val2

	// if you just want to do one value ... just do one
	println ab.val2

}

// run it
main() 