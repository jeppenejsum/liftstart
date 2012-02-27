package code
package snippet

import net.liftweb._
import http._
import net.liftweb.util._
import net.liftweb.common._
import Helpers._
import lib._

import org.junit.runner.RunWith
import org.specs2.mutable._
import org.specs2.runner._
import org.specs2.execute._

@RunWith(classOf[JUnitRunner])
class HelloWorldTestSpecs extends Specification {

  "HelloWorld Snippet" should {
    "run text case" in {
      1 must_== 1
    }
  }
}
