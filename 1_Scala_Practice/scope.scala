/** Prints a triangle made of "X"s
  * This is another style of comment
  */
def asciiTriangle(rows: Int) {
    
    // This is cute: multiplying "X" makes a string with many copies of "X"
    def printRow(columns: Int): Unit = println("X" * columns)
    
    if(rows > 0) {
        printRow(rows)
        asciiTriangle(rows - 1) // Here is the recursive call
    }
}

// printRow(1) // This would not work, since we're calling printRow outside its scope
asciiTriangle(6)

