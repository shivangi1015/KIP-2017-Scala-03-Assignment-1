/* 3. Write a function that concatenates a list of lists into a single list. Its runtime should be linear  in the total length of all lists. The signature of the method should be:
def concateList[A](l1:List[A],l2:List[A]):List[A]
(Note: You can use Pattern matching over lists to implement the method. But, do not use any provided methods as solutions) */

object Concatenation {
    def main(args: Array[String]) {
    type A=Int
    def concateList[A](list1: List[A], list2: List[A]): List[A] =
    list1 match {
        case Nil => list2
        case x :: xs1 => x :: concateList(xs1, list2)
        }
     val list1=List(1,2,3)
     val list2=List(4,5,6,7,8,9)
     val newList=concateList(list1,list2)
     println(s"Concatenated List: $newList")
    }
}
