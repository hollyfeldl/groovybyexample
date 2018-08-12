// slices example
// https://gobyexample.com/slices


static main() {

	// Groovy lists are like Go slices

	def s = [null] * 3 						// a list of 3 nulls -- this only works in one dimension
	println "is array: ${ s.class.array} "	// show a list
	println "emp: $s"

	s[0] = "a"
	s[1] = "b"
	s[2] = "c"

	println "set: $s"
	println "get: ${ s[2] }"
	println "len: ${ s.size() }"

	s << "d"
	s = s + ["e", "f"]

	println "apd: $s"

	def c = s.clone()
	assert c == s
	assert !c.is(s) //Reference inequality
	c << "g"

	println "org: $s and cpy: $c "

	String l_one = s[2..<5]
	println "sl1: $l_one"

	String l_two = s[0..<5]
	println "sl2: $l_two"

	String l_three = s[2..<s.size()]
	println "sl3: $l_three"

	String t = ["g", "h", "i"]
	println "dcl: $t"

	def twoDList = [null] * 3 // need to build list this way 

	for ( Integer i in 0..<3 ) {
		Integer innerLen = i + 1
		twoDList[i] = [null] * innerLen
		for ( Integer j in 0..<innerLen ) {
			twoDList[i][j] = i + j
		}
	}

	println "twoDList: $twoDList"

}

// run it
main()