// the switch example
// https://gobyexample.com/switch

static whatAmI( def i ) {
	switch ( i ) {
		case Boolean:
			println("I'm a bool")
			break
		case Integer:
			println("I'm an int")
			break
		default:
			def c = i.getClass()
			println("Don't know $c")
	}
}


static main() {

	// unlike g
	def i = 2
	print "Write $i as "
	switch (i) {
		case 1:
			println "one"
			break

		case 2:
			println "two"
			break

		case 3:
			println "three"
			break
	}

	def now1 = new Date()
	def day = now1.format("EEEE")
	switch ( day ) {
		case "Saturday":
		case "Sunday":
			println "$day -- It's a weekend!"
			break
		default:
			println "$day -- It's a weekday." 
	}

	def now2 = new Date()
	def hour = now2.format("HH").toInteger()
	switch ( hour ) {
		case { hour < 12 }:
			println "$now2 -- It's before noon"
			break
		default:
			println "$now2 -- It's after noon"
	}

	// test some objects
	whatAmI(true)
	whatAmI(1)
	whatAmI("hey")
	whatAmI(["a","b","c"])

}

// run it
main()

