// WrapCounter counts up to a max value based on a bit size
class WrapCounter(counterBits: Int) {

  val max: Long = (1 << counterBits) - 1
  var counter = 0L
    
  def inc(): Long = {
    counter = counter + 1
    if (counter > max) {
        counter = 0
    }
    counter
  }
  println(s"counter created with max value $max")
}

/*  Execute `scala -i classes.scala` and send the following commands.
 *  
 *  val x = new WrapCounter(2);
 *  x.inc();  // Increments the counter
 *  x inc();  // Increments the counter (the class dot suffix can be omitted)
 */