object Main extends App
{
  println("== start ==") 
  
  def isort(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case x::xs2 => iinsert(x, isort(xs2))
  }

  def iinsert(x: Int, xs: List[Int]): List[Int] = xs match {
    case Nil => x::Nil
    case y::xs2 if x <= y => x::xs
    case y::xs2 => y::iinsert(x, xs2)
  }

  val mylist = List(3,2,7,1)
  println(mylist)
  println(isort(mylist))

  def iappend[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case Nil => ys
    case x::xs2 => x::iappend(xs2, ys)
  }

  val mylist2 = List(10,12)
  println(iappend(mylist, mylist2))

  def ireverse[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case x::xs2 => ireverse(xs2) ::: List(x)
  }

  println(ireverse(mylist))

}
