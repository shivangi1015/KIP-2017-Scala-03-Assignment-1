/* 4. Write a function that splits a list elements into a pair of lists on the basis of given boolean function. The signature of the method should be:
def splitList[A](l:List[A],f:A=>Boolean):(List[A],List[B]) 
(Note: Do not use method filter provided in the library) */

object SplitList extends App
{
   type A= Int
   type B= Any
  def splitList[A](list:List[A],f:A=>Boolean):(List[A],List[B]) = 
  {
   val list1=for (i <- list if (f(i) == true)) yield i
   val list2=for (i <- list if (f(i) == false)) yield i
    (list1,list2)
  }
  val list=List(1,2,3,4,5,6,7,8)
  val (list1,list2) = splitList(list, (x: A) =>(x%2 == 0) )
  println("")
  println("Splitting of List based on Even/Odd:")
  println("")
  println(s"First List: $list1")
  println(s"Second List: $list2")
}
