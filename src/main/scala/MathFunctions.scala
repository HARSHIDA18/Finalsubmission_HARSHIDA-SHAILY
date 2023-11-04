class MathFunctions {
  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = {
    a - b
  }

  def multiplication(a: BigInt, b: BigInt) = a * b

  def division(a: Double, b: Double): Double = {
    if (b == 0) 0.0
    else a / b
  }

  def modulus(a: Int, b: Int): Int = {
    a % b
  }
}