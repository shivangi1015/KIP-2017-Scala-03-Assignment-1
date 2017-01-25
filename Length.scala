/* 1. Compute the length of a list using method foldRight. The signature of the method should be:  
def length[A](l: List[A]): Int
(Note: Do not use length method provided in the scala library) */

object Length extends App{
         type A=Int
	 val list=List(1,2,3,4,5,6,7,8,9,10)
	 def length1[A](l: List[A]): Int={
		val newList=for(iterator<-l) yield 1
		val total = newList.foldRight(0){(x: Int,y :Int) => x + y}
		total
		}
	  val len=length1(list)
         println(s"Length of List: $len")
}



