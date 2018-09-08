// recursion example
// https://gobyexample.com/recursion

// basic closures run into problems because of stack size 
// trampoline can help
// http://groovy-lang.org/closures.html#_trampoline
// also use BigInteger to handle big numbers.


fact = { BigInteger n, BigInteger count = 1G ->
	n > 1G ? fact.trampoline(n - 1G, count * n) : count
}.trampoline()

void main() {

	for ( Integer i in 1G..24G ) {
		println "$i -- ${ fact(i) }"
	}

}

// run it
main()


