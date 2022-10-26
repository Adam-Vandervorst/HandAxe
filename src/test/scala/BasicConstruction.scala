import munit.FunSuite

import be.adamv.handaxe.*


object BasicConstructs:
  import Locator.*
  import Qualifier.*
  import Grip.*
  import Command.*

  val at = Accessor(At, First, Index)

  val within = Accessor(Within, First, Sub)
  
  val spanOver = Accessor(Over, First, Span)

  val spanOverLast = Accessor(Over, First, Span)

  val spanOverAll = Accessor(Over, Every, Span)
  
  val spanOverEvery = Accessor(Over, Every, Span)

  val spanOverEach = Accessor(Over, Every, Span)
  
  val where = Accessor(Of, Where, Value)

  val lastWhere = Accessor(Of, Last, Value)

  val everyWhere = Accessor(Of, Every, Value)
  
  val indexOfWhere = Accessor(Of, Where, Index)

  
  val atLastPut = Setter(Accessor(At, Last, ???), Put)

  val withinEcho = Setter(Accessor(Within, ???, ???), Echo)

  val withinReplace = Setter(Accessor(Within, ???, ???), Replace)

  val overFill = Setter(Accessor(Over, First, Value), Fill)
