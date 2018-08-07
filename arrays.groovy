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

	// Those that are groovy, will just use lists.

	def l = [null] * 5 // a list of 5 nulls -- only works in one dimension
	println "is array: ${ l.class.array} "	
	println "emp: $l"

	l[4] = 101
	println "set: $l"
	println "get: ${ l[4] }"
	println "len: ${ l.size() }"

	def b = [1, 2, 3, 4, 5]
	println "dcl: $b"

	// can do the same thing in multiple dimensions

	def twoDList = [null] * 2 // need to build list this way 
	for ( def init in 0 ..< (twoDList.size()) ) {
		twoDList[init] = [null] * 3 
	}

	def twoDArr = new Integer [2][3] // array

	for ( def i in 0..<2 ) {
		for ( def j in 0..<3 ) {
			twoDList[i][j] = i + j
			twoDArr[i][j] = i + j
		}
	}

	println "twoDList: $twoDList"
	println "towDArr: $twoDArr"

}


// run it
main()