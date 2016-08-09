final class Complex(val real: Int, val imaginary: Int) extends Ordered[Complex] {

	def +(operand: Complex) = 
		new Complex(real + operand.real, imaginary+operand.imaginary)


	def +(operand: Int) =
		new Complex(real + operand, imaginary)

	def -(operand: Complex) =
		new Complex(real - operand.real, imaginary - operand.imaginary);

	def -(operand: Int) =
		new Complex(real - operand, imaginary)

	def compare(that: Complex) : Int = {
		def myMagnitude = Math.sqrt(real ^ 2 + imaginary ^ 2)
		def thatMagnitude = Math.sqrt(that.real ^ 2 + that.imaginary ^ 2 )
		(myMagnitude - thatMagnitude).round.toInt
	}
}

