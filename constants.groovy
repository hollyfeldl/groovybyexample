// constant example
// https://gobyexample.com/constants


class Globals {
	static final String s = "constant"
}

def Main() {

	println Globals.s

	final int n = 500000000
	final float f = 3e20 / n
	final double d = 3e20 / n

	println "float: ${f}"

	println "double: ${d}"

	println Math.sin(n)

}

Main()

