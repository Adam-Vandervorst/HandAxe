import be.adamv.handaxe.*


object BasicConstructs:
  import Locator.*
  import Qualifier.*
  import Grip.*
  import Command.*

  val spanOverEvery = Accessor(Over, Every, Span)

  val indexOfWhere = Accessor(Of, Where, Index)

  val atLastPut = Setter(Accessor(At, Last, ???), Put)

  val withinEcho = Setter(Accessor(Within, ???, ???), Echo)

  val withinReplace = Setter(Accessor(Within, ???, ???), Replace)

  val overFill = Setter(Accessor(Over, First, Value), Fill)
