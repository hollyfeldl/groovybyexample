// arrays example
// https://gobyexample.com/arrays


static main() {

	// while there are arrays in Groovy, they are mostly for compatability with Java.


	def a = new Integer [5] // an array of 5 nulls
	println "is array: ${ a.class.array} "
	println "emp: $a"

	a[4] = 100
	println "set: $a"
	println "get: ${ a[4] }"
	println "len: ${ a.size() }"

	def b = [1, 2, 3, 4, 5] as int[]
	println "dcl: $b"

	// can do the same thing in multiple dimensions


	def twoDArr = new Integer [2][3] // array

	for ( def i in 0..<2 ) {
		for ( def j in 0..<3 ) {
			twoDArr[i][j] = i + j
		}
	}

	println "towDArr: $twoDArr"

}


// run it
main()