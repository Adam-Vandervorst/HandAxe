package be.adamv.handaxe


enum Locator:
  case At, Within, Of, Over, Across

enum Qualifier:
  case First, Last, Every, Each, All, Where

enum Grip:
  case Index, Element, Key, Value, Span, Sub

enum Command:
  case Put, Replace, Place, Add, Delete, Fill, Set, Remove, Echo

case class Accessor(locator: Locator, qualifier: Qualifier, grip: Grip)

case class Setter(accessor: Accessor, command: Command)
