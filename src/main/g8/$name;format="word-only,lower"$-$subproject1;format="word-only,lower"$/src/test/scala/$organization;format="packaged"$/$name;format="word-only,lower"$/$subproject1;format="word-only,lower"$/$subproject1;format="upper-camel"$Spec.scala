package $organization$.$name;format="word-only,lower"$.$subproject1;format="word-only,lower"$

import org.scalatest._

class $subproject1;format="upper-camel"$Spec extends FlatSpec with Matchers {
  val $subproject1;format="lower-camel"$ = new $subproject1;format="upper-camel"$

  "greet" should "greet bob" in {
    $subproject1;format="lower-camel"$.greet("bob") shouldBe "hello, bob"
  }
}
