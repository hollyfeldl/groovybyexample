// range example
// https://gobyexample.com/range



def main() {

	def nums = [2, 3, 4]
	Integer sum1 = 0

	// using the for-in construct
	for ( Integer num in nums) {
		sum1 += num
	}
	println "using for-in ---------- sum1: $sum1"

	// using list.each and closure 
	Integer sum2 = 0
	nums.each { num2 -> sum2 += num2 }
	println "using closure --------- sum2: $sum2"

	// using a range operator
	Integer sum3 = 0
	for ( Integer i in 0..<3 ) {
		sum3 += nums[i]
	}
	println "using range operator -- sum3: $sum3"

	println "Skipping the index example for now"

	def kvs = ["a": "apple", "b": "banana"]

	for ( def k in kvs.keySet()) {
		println "$k, ${kvs[k]}"
	}

	// use a .each-and-closure for this example, could use for-in like above
	kvs.keySet().each { k2 -> println "key: $k2"}

	Integer i2 = 0
	for ( Character c in "Groovy" ) {
		println "$i2 $c ${ c as Integer }"
		i2 ++
	}

}

// run it 
main()