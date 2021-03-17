class DoubleQueue extends Traits {
  override def enqueue(item: Int): Unit = {
        if (first_index == -1 && last_index == -1) {
          first_index += 1
          list = list :+ (2 * item)
        }
        else {
          list = list :+ (2 * item)
        }
        last_index += 1
      }
    }
    class SquareQueue extends Traits {
      override def enqueue(item: Int): Unit = {
        if (first_index == -1 && last_index == -1){
          first_index += 1
          list = list :+ (item*item)
        }
        else{
          list = list :+ (item*item)
        }
        last_index += 1
      }

    }
