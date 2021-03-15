package `trait`

trait TraitQueue {
  def enqueue(list: List[Int],input: List[Int]): List[Int]

  def dequeue(list: List[Int]): Any ={
    try {
      val dequeued = list.drop(list.head)
      dequeued
    }
    catch {
      case e: NoSuchElementException => "List is empty"
    }
  }

}
