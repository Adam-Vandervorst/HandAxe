import munit.FunSuite

import be.adamv.handaxe.*


object TestLists:
  // 🍇 🍈 🍉 🍊 🍋 🍌 🍍 🥭 🍎 🍏 🍐 🍑 🍒 🍓 🫐 🥝 🍅 🫒 🥥 🥑 🍆 🥔 🥕 🌽 🌶 🫑 🥒 🥬 🥦 🧄 🧅 🍄 🥜 🫘 🌰

  val veggies = List("🥕", "🌶", "🥑", "🥦")
  val manyVeggies = List("🌶", "🥑", "🥑", "🥑", "🥑", "🥑", "🌶", "🥑", "🥑", "🥑", "🥑")
  val otherVeggies = List("🥑", "🥕", "🫑", "🍆", "🌶")

  def isPepper(s: String): Boolean = s == "🫑" || s == "🌶"


class BasicAccessor extends FunSuite:
  import TestLists.*
  import BasicConstructs.*

  test("at") {
    assert(at(veggies, 2) == "🥑")
  }

  test("within") {
    assert(within(veggies, Span(2, 4)) == List("🥑", "🥦"))
  }

  test("indexOfWhere") {
    assert(indexOfWhere(otherVeggies, isPepper) == 2)
  }

  test("where") {
    assert(where(otherVeggies, isPepper) == "🫑")
  }

  test("lastWhere") {
    assert(lastWhere(otherVeggies, isPepper) == "🌶")
  }

  test("everyWhere") {
    assert(everyWhere(otherVeggies, isPepper) == List("🫑", "🌶"))
  }

  test("spanOver") {
    assert(spanOver(veggies, List("🌶", "🥑")) == Span(1, 3))
    assert(spanOver(manyVeggies, List("🥑", "🥑", "🥑")) == Span(1, 4))
  }

  test("spanOverLast") {
    assert(spanOverLast(manyVeggies, List("🥑", "🥑", "🥑")) == Span(8, 11))
  }

  test("spanOverAll") {
    assert(spanOverAll(manyVeggies, List("🥑", "🥑", "🥑")) == List(Span(1, 4), Span(2, 5), Span(3, 6), Span(7, 10), Span(8, 11)))
  }

  test("spanOverEvery") {
    assert(spanOverEvery(manyVeggies, List("🥑", "🥑", "🥑")) == List(Span(1, 4), Span(7, 10)))
  }

  test("spanOverEach") {
    assert(spanOverEach(manyVeggies, List(List("🥑", "🥑", "🥑"), List("🥑", "🌶"))) == List(Span(1, 3), Span(4, 6)))
  }
