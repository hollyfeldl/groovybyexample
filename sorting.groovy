// https://gobyexample.com/sorting



// https://stackoverflow.com/questions/15132211/groovy-way-to-check-if-a-list-is-sorted-or-not

Boolean isSorted(list) {
    list.size() < 2 || (1..<list.size()).every { list[it - 1] <= list[it] }
}

void main() {

	// fill a list with some strings
	def strs = ["c", "a", "b"]
	//sort it
	println("Strings: ${ strs.sort() }")

	// fill a list with ints
	def ints = [7, 2, 4]
	// sort it
	println("Ints:    ${ ints.sort() }")

	// some additional lists
	def str2 = ["cindy", "alice", "bob"]
	def int2 = ["42", "7", "66"]

	// check if things sorted
	println("Sorted:  $strs - ${ isSorted(strs) }")
	println("Sorted:  $str2 - ${ isSorted(str2) }")
	println("Sorted:  $ints - ${ isSorted(ints) }")
	println("Sorted:  $int2 - ${ isSorted(int2) }")

}


// run it

main()
