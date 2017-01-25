/* 2. Implement a method hasSubsequence for checking whether a List contains another List as a subsequence. For instance, List(1,2,3,4) would have List(1,2), List(2,3), and List(4) as subsequences. The signature of the method should be:
def hasSubsequence[A](list:List[A],sub:List[A]):Boolean */

object SubSequence extends App
{
        type A=Int
  
        def hasSubSequence[A](list: List[A], sub: List[A]): Boolean = {
        list.containsSlice(sub)
        }
  val list= List(1,2,3,4)
  val sub = List(2,1)
  val sub2=List(3,4)
  println(hasSubSequence(list,sub))
  println(hasSubSequence(list,sub2))
}
