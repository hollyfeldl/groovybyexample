// methods example
// https://gobyexample.com/methods


class Rect {
	Integer width
	Integer height

	Integer area() {
		return width * height
	}

	Integer perim() {
		return (2 * width) + (2 * height)
	}

}


void main() {

	Rect r = [width: 10, height: 5]
	println "area: ${r.area()}"
	println "perim: ${r.perim()}"

	println "Do not worry about pointer example"

}

//run it
main()