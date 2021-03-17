trait Traits {
  var list: List[Int] = List[Int]()
  var first_index: Int = -1
  var last_index: Int = -1

  def dequeue(): Unit = {
    require(first_index != -1 && last_index != -1)    // Checks for queue underflow !!
    if (last_index == first_index) { // Removing the last item from the queue
      list = list.drop(1)
      last_index = -1
      first_index = -1
    }
    else {
      list = list.drop(1)
      first_index = first_index + 1
    }
  }

  def enqueue(item: Int): Unit = {
    if (first_index == -1 && last_index == -1) {   // Checks if it is the first item
      first_index += 1
      list = list :+ item
    }
    else {
      list = list :+ item
    }
    last_index += 1
  }



  //method for displaying the items of Queue as List
  def getQueue: List[Int] = {
    list
  }

}
