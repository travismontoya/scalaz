package scalaz

trait Show[F]  { self =>
  ////
  def show(f: F): List[Char]
  def shows(f: F): String = show(f).mkString

  // derived functions

  ////
  val showSyntax = new scalaz.syntax.ShowSyntax[F] {}
}

object Show {
  def apply[F](implicit F: Show[F]): Show[F] = F

  ////

  ////
}
