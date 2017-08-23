package $organization$.$name;format="word-only,lower"$.$subproject2;format="word-only,lower"$

import org.scalatest._

class $subproject2;format="upper-camel"$Spec extends FlatSpec with Matchers {
  val $subproject2;format="lower-camel"$ = new $subproject2;format="upper-camel"$

  "greet" should "greet bob" in {
    $subproject2;format="lower-camel"$.greet("bob") shouldBe "hello, bob"
  }
}
