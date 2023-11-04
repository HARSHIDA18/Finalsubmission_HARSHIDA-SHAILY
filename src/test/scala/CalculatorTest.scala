import org.scalatest.funsuite.AnyFunSuite

class CalculatorTest extends AnyFunSuite{
  val obj = new MathFunctions()
  test("Testing my functions for basic mathematical operations"){
    assert(obj.add(3, 5) == 8)
    assert(obj.add(9,10) == 19)
    assert(obj.subtract(10,9)==1)
    assert(obj.subtract(4,19)== -15)
    assert(obj.multiplication(19,0)==0)
    assert(obj.multiplication(89,10)==890)
    assert(obj.division(19.0,0.0)==0.0)
    assert(obj.division(18.0,3.0)==6.0)
    assert(obj.modulus(36,5)==1)
  }
}
