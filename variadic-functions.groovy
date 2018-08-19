// variadic function example
// https://gobyexample.com/variadic-functions


static void sum( Integer... nums) {

	Integer total = 0
	for ( num in nums ) {
		total += num
	}

	println "$nums $total"

}


def main() {
	
	sum(1, 2)
	sum(1, 2, 3)

	def nums = [1, 2, 3, 4]

	// use the spread operator
	sum(*nums)

}


// run it
main()
