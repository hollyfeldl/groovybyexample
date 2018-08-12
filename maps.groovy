//maps example
// https://gobyexample.com/maps


static main() {

	def m = [:]

	m["k1"] = 7
	m["k2"] = 13
	println "map: $m"

	Integer v1 = m["k1"]
	println "v1: $v1"

	Integer v2 = m.k2
	println "v2: $v2"

	println "len: ${m.size()}"

	Boolean rst = m.remove("k2")
	println "$m, key removed: $rst"

	// if you try and get a key not there ... will return null
	Integer v3 = m["k2"]

	// use containsKey to test for it
	Boolean prs = m.containsKey("k2")

	println "prs: $prs, v3: $v3"

	def n = [foo: 1, bar: 2]
	println "map: $n"

}

// run it
main()


