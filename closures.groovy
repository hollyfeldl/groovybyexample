// closures example
// https://gobyexample.com/closures


def intSeq() {

	Integer i = 0

	Closure theFunc = { i++ ; return i }
	return theFunc

}



def main() {

	nextInt = intSeq()
	println nextInt()
	println nextInt()
	println nextInt()

	newInt = intSeq()
	println newInt()

}

// run it
main()
