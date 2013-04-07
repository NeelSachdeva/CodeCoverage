import org.junit.runner.RunWith
import org.scalatest.BeforeAndAfter
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import models.Test

@RunWith(classOf[JUnitRunner])
class Demotest extends FunSuite {
  test("Example test") {
    val name = Test.printMe("John")
    assert(name === "Hello John")
  }

}