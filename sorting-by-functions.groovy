// https://gobyexample.com/sorting-by-functions

void main() {

	def fruits = ["peach", "banana", "kiwi"]

	// use a closure to measure the size of the string
	// as the sorting fuction
	println(fruits.sort({ a -> a.size() }))

}

// run it

main()
