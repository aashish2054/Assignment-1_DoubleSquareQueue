import org.scalatest.flatspec.AnyFlatSpec
class QueueTest extends AnyFlatSpec {
  "The DoubleQueue" should "give correct output" in{
    val double=new DoubleQueue
    val list=List(4,8,16,20)
    double.enqueue(2)
    double.enqueue(4)
    double.enqueue(8)
    double.enqueue(10)
    val result=double.getQueue
    assert(list===result)
  }
  "The SquareQueue" should "give correct output" in{
    val square=new SquareQueue
    val list=List(4,9,16,25)
    square.enqueue(2)
    square.enqueue(3)
    square.enqueue(4)
    square.enqueue(5)
    val result=square.getQueue
    assert(list===result)
  }
}
