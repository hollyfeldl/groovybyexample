// constant example
// https://gobyexample.com/constants


class Globals {
	static final String s = "constant"
}

def Main() {

	println Globals.s

	final Integer n = 500000000
	final Float f = 3e20 / n
	final Double d = 3e20 / n

	println "float: ${f}"

	println "double: ${d}"

	println Math.sin(n)

}

Main()

