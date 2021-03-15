package queueOperations
import `trait`.TraitQueue

class Queue_double extends TraitQueue {
  override def enqueue(list: List[Int], input: List[Int]): List[Int] = {
    val items = input.map(value => value*2)
    val enqueued = list.concat(items)

    enqueued
  }

}
