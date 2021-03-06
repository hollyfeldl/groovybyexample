// structs example using groovy classes
// https://gobyexample.com/structs


// class with defined constructor
class Person {
	String 		name
	Integer 	age

	// make a constructor
	Person(name, age) {
		this.name = name
		this.age = age
	}

	String toString() {
		return "{$name $age}"
	}

}

// class without constructor 
class PersonWO {
	String 		name
	Integer 	age

	String toString() {
		return "{$name $age}"
	}

}

void main() {

	Person p1 = ["Bob", 20]
	println p1.toString()

	PersonWO p2 = [name: "Alice", age: 30]
	println p2.toString()

	PersonWO p3 = [name: "Fred"]
	println p3.toString()

	// Groovy doesn't have pointers
	PersonWO p4 = [name: "Ann", age: 40]
	println p4.toString()

	s = new PersonWO(name: "Sean", age: 50)

	println s.name
	println s.age

	s.age = 51
	println s.age

}

// run it

main()