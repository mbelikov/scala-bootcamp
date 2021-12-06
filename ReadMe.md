# Scala Bootcamp

Adoption of the [Evolution Gaming](https://eng.evolutiongaming.com/) Scala Bootcamp.

| :zap:        Please be aware many artefacts within this repository are still specific to the Evolution Gaming's Bootcamp. |
|---------------------------------------------------------------------------------------------------------------------------|

## Scala learning plan

It is inspired by the article [Scala isn't hard](https://scalac.io/blog/scala-isnt-hard-how-to-master-scala-step-by-step).

> ## Essentials
> - java, kotlin, js, scala?
> - val, var, def
> - inference
> - recursion
> - String interpolation
> - annotations @tailrec, @inline
> - type hierarchy in Scala
> - coursier
> 
> Presentation: [Essentials.pdf](./presentations/Essentials.pdf)
> 
> Practice: [Basics.scala](./src/main/scala/com/evolutiongaming/bootcamp/basics/Basics.scala)
> ## OOP
> - classes, instances, fields, methods
> - apply and skipping “.” in the calls
> - traits, abstract classes, inheritance, anonymous classes
> - enums
> - case classes
> - exceptions
> - generics basics
> - [ClassesAndTraits.scala](./src/main/scala/com/evolutiongaming/bootcamp/basics/ClassesAndTraits.scala)
> ## FP principles
> - FunctionN: [Functions.scala](./src/main/scala/com/evolutiongaming/bootcamp/functions/Functions.scala)
> - lambda / anonymous function: [FunctionsDescoped.scala](./src/main/scala/com/evolutiongaming/bootcamp/functions/FunctionsDescoped.scala)
> - function as an argument / object (higher-order function)
> - HOFs from collection library: [DataStructures.scala](./src/main/scala/com/evolutiongaming/bootcamp/basics/DataStructures.scala)
> - for comprehension (example of map, flatMap, filter)
> - basic data structures: Option, Try, Either: [ErrorHandling.scala](./src/main/scala/com/evolutiongaming/bootcamp/error_handling/ErrorHandling.scala)
> ## Pattern matching
> - case classes
> - string
> - regex
> - numbers
> - https://blog.rockthejvm.com/8-pm-tricks/
> ## ADT
> - sealed traits and case classes
> - ADT vs OOP
> - type classes
> - https://github.com/evolution-gaming/scala-bootcamp/tree/master/src/main/scala/com/evolutiongaming/bootcamp/adt
> ## Advanced FP
> - partial functions and... Maps
> - partially applied functions
> - lazy computation
> - Cats and the 'usual suspects': Show, Eq, Id, Order, Monoid, Applicative
> - https://github.com/evolution-gaming/scala-bootcamp/tree/master/src/main/scala/com/evolutiongaming/bootcamp/functions
> ## Async FP
> - Future and threads
> - https://github.com/evolution-gaming/scala-bootcamp/blob/master/src/main/scala/com/evolutiongaming/bootcamp/async/async.scala
> ## Contextual Abstractions (implicits)
> - implicit val
> - extension methods
> - organising the contextual (implicit) in packages and objects
> - type class in Cats / Circe
> - https://github.com/evolution-gaming/scala-bootcamp/blob/master/src/main/scala/com/evolutiongaming/bootcamp/typeclass/CodecsExercise.scala
> - https://github.com/evolution-gaming/scala-bootcamp/blob/master/src/main/scala/com/evolutiongaming/bootcamp/cats/v3/p0_basics.sc
> - context functions and implicit conversions
> - https://github.com/evolution-gaming/scala-bootcamp/tree/master/src/main/scala/com/evolutiongaming/bootcamp/implicits
> - Advanced ADT/type classes
> ## Type System
> - variance / variance position
> - variance vs bounds
> - https://github.com/evolution-gaming/scala-bootcamp/tree/master/src/main/scala/com/evolutiongaming/bootcamp/variance
> - self-types
> - higher-kinded types (HKD)
> - https://github.com/evolution-gaming/scala-bootcamp/blob/master/src/main/scala/com/evolutiongaming/bootcamp/typeclass/HigherKindedTypes.scala
> - trait linearisation
> ## Scala Ecosystem
> - our stack #1: refined / monocle / quicklens / squants / enumeratum
> - our stack #2: circe / pureconfig / sttp / tapir
> - meta programming: shapeless / magnolia / tofu / derevo
> - ZIO
> - Akka
> - Optional: Apache Kafka / scala client
> - Optional: Cats / Cats Effect
> - Optional: parboiled2


## Schedule

...

## Preparation for the online sessions

### Prerequisites

Please install recent versions of the following before the first lecture:
- [intelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/)
  - or even [intelliJ IDEA Ultimate](https://www.jetbrains.com/idea/download/)
- [Scala plug-in](https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html) for IntelliJ IDEA
- OpenJDK, e.g. [AdoptOpenJDK](https://adoptopenjdk.net/), [Oracle OpenJDK](https://jdk.java.net/) or [OpenJDK using homebrew](https://formulae.brew.sh/formula/openjdk) (for MacOS)
- [Scala](https://www.scala-lang.org/download/)
- [SBT](https://www.scala-sbt.org/download.html)
- [Git](https://git-scm.com/downloads)
- make the scalafmt you default IDE formatter

Alternatives that are also expected to work:
- [Visual Studio Code with Metals](https://marketplace.visualstudio.com/items?itemName=scalameta.metals) as an IDE

### Prepare the project

- Check out the [Scala Bootcamp](https://github.com/evolution-gaming/scala-bootcamp) project
- Run tests from the command line using `sbt test`
- Open the project in IntelliJ IDEA and run tests there (right-click on `scala-bootcamp` project in the left panel and click `Run ScalaTests in ‘scala…’`)

The tests will fail (for now), this is normal and expected.

### Troubleshooting

In case of issues:
- Read [Getting Started with Scala](https://docs.scala-lang.org/getting-started/index.html)
- Read [Discover IntelliJ IDEA for Scala](https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html)
- Ask in the dev chat

## Learning resources

All resources are listed in no particular order.

### Books

- [Essential Scala](https://underscore.io/books/essential-scala/) (free)
- [Scala with Cats 2](https://www.scalawithcats.com/) (free)
- [Functional Programming for Mortals with Scalaz](https://leanpub.com/fpmortals) (free+)
- [Functional Programming for Mortals with Cats](https://leanpub.com/fpmortals-cats) ($15+)
- [Scala from Scratch: Exploration](https://leanpub.com/scala-from-scratch-exploration) ($15+)
- [Functional Programming in Scala](https://www.manning.com/books/functional-programming-in-scala#toc) ($25+)
- [Practical FP in Scala: A hands-on approach](https://leanpub.com/pfp-scala) ($30+)
- [Programming in Scala](https://booksites.artima.com/programming_in_scala_3ed) ($30+)
- [Zionomicon](https://www.zionomicon.com/) ($70)

### Other

- [DevInsideYou channel](https://www.youtube.com/c/DevInsideYou)
- [Coursera Scala Specialization](https://www.coursera.org/specializations/scala)
- [Rock the JVM courses](https://rockthejvm.com/)
- [Tour of Scala](https://docs.scala-lang.org/tour/tour-of-scala.html) & [Scala Book](https://docs.scala-lang.org/overviews/scala-book/introduction.html) from [scala-lang.org](https://www.scala-lang.org/)
- [Scala Exercises](https://www.scala-exercises.org/) 
- [FP Tower](https://www.fp-tower.com/)

### Non-Scala

- [Learn Git Branching](https://learngitbranching.js.org/)

## Status

...