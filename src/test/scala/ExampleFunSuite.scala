import org.scalatest.FunSuite

class ElementSuite extends FunSuite {
  test("asert test") {
    assert(List(1,2,3).contains(3))
  }
  test("assertResult test") {
    assertResult(2) {
      val a = 3
      a - 1
    }
  }
  test("assertThrows test") {
    assertThrows[ArithmeticException] {
      3 / 0
    }
  }
  test("intercept test") {
    // assert the exception and catch the result
    val caught = intercept[ArithmeticException] {
      3 / 0
    }
    assert(caught.getMessage == "/ by zero")
  }
}

