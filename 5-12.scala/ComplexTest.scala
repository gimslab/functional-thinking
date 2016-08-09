import org.scalatest.FunSuite

class ComplexTest extends FunSuite {

	def fixture = 
		new {
			val a = new Complex(1, 2)
			val b = new Complex(30, 40)
		}

	test("plus"){
		val f = fixture
		val z = f.a + f.b
		assert(1+30 == z.real)
	}

}
