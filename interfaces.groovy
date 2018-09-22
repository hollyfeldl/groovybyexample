// interfaces example
// https://gobyexample.com/interfaces

interface Geometry {
	Double area()
	Double perim()
	String display()
}

class Rect implements Geometry {
	Double width
	Double height

	Double area() {
		return width * height
	}

	Double perim() {
		return (2.0 * width) + (2.0 * height)
	}

	String display() {
		return "($width $height)"
	}

}

class Circle implements Geometry {
	Double radius

	Double area() {
		return Math.PI * radius * radius
	}

	Double perim() {
		return 2.0 * Math.PI * radius
	}

	String display() {
		return "($radius)"
	}

}

void measure(Geometry g) {
	println g.display()
	println g.area()
	println g.perim()
}

void main() {

	Rect r = [width: 3.0, height: 4.0]
	Circle c = [radius: 5]

	measure(r)
	measure(c)

}

// run it
main()
