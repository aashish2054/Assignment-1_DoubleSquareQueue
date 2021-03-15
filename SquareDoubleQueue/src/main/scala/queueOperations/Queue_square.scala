package queueOperations

import `trait`.TraitQueue

class Queue_square extends TraitQueue{
  override def enqueue(list: List[Int], input: List[Int]): List[Int] = {
    val elements = input.map(value => value*value)
    val square_enqueued = list.concat(elements)

    square_enqueued
  }
}
