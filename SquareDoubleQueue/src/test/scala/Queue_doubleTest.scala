import org.scalatest.flatspec.AnyFlatSpec
import queueOperations.Queue_double
class Queue_doubleTest extends AnyFlatSpec {
    val double_queue = new Queue_double

    "double_queue" should "give the correct output when enqueued" in {
      val list = List(5,6,7,8)
      val input = List(4,8)
      val expected = List(5,6,7,8,8,16)
      val result = double_queue.enqueue(list,input)
      assertResult(expected)(result)
    }

    it should "only return the enqueued elements" in {
      val list = List()
      val input = List(3,4)
      val expected = List(6,8)
      val result = double_queue.enqueue(list,input)
      assertResult(expected)(result)
    }

    it should "give the correct output when dequeued" in {
      val list = List(1,2,3,4)
      val expected = List(2,3,4)
      val result = double_queue.dequeue(list)
      assertResult(expected)(result)
    }

    it should "return List is empty, hence cannot be dequeued" in {
      val list = List()
      val expected = "List is empty"
      val result = double_queue.dequeue(list)
      assertResult(expected)(result)
    }

    it should "return nothing when dequeued" in {
      val list = List(1)
      val expected = List()
      val result = double_queue.dequeue(list)
      assertResult(expected)(result)
    }




}
