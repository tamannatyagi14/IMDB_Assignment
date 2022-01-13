import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
class CSVDemoTest extends AnyFlatSpec with should.Matchers{
  "My functionToRead" should "return" in{
    CSVDemo.functionToRead() should be (5)
  }
}
