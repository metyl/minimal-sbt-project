package demo

import org.scalatest.FunSuite

class MainTest extends FunSuite {
  test("addition") {
    assert(Main.add(1, 2) == 3)
  }
}
