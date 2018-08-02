// for example
// https://gobyexample.com/for

// while go only has the for loop, groovy has while, for, and for-in


def Main() {

	// while loop
	def i = 1
	while ( i <= 3 ) {
		println i
		i = i + 1
	}

	// standard for loop
	for ( def j = 7; j <= 9; j++ ) {
		println j
	}

	// example of a range
	for ( def k in 4..6 ) {
		println k
	}

	// make an infinite loop but break out after the first run
	final Integer q = 1 
	while ( q == 1 ) {
		println "loop"
		break
	}

	// print only the odd ones
	for ( def n = 0; n <= 5; n++ ) {
		if ( n % 2 == 0 ) {
			continue
		}
		println n
	}

}

// run it 
Main()
