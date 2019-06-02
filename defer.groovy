// https://gobyexample.com/defer

import java.io.File

void main() {

	try {
		File f = createFile("/tmp/defer.txt")
		writeFile(f)			
	} catch (Exception ae) {
		println ae.toString()
	} finally {
		closeFile()
	}

}

def createFile( String p ) {
	println("creating")
	return new File(p)
}

def writeFile( File f ) {
	println("writing")
	f.withWriter("utf-8") {
		writer -> writer.writeLine "Hello World"
	}
}

def closeFile() {
	println("closing")
	//do not have to close the file - Groovy takes care of that
}



// run it
main()


