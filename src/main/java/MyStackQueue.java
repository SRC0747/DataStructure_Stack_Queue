import org.junit.Assert;
import org.junit.Test;


public class MyStackQueue {
        public void given3NumbersAddedToStack(){
            MyNode<Integer> myFirstNode = new MyNode(70);
            MyNode<Integer> mySecondNode = new MyNode(30);
            MyNode<Integer> myThirdNode = new MyNode(56);
            myFirstNode.setNext(mySecondNode);
            mySecondNode.setNext(myThirdNode);
            boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().getNext().equals(myThirdNode);
            Assert.assertTrue(result);
        }
    }


@Test
/*Pop All the Elements from the Stack*/
public class PopTheStack {
    public void popTheStack(){
        MyNode<Integer> myFirstNode = new MyNode(70);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(56);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        myLinkedList.pop();
        myLinkedList.pop();
        myLinkedList.pop();
        boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}

@Test
public class MyQueue {
    public void given3NumbersAddedToQueue(){
        MyNode<Integer> myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}

/*Dequeue */
@Test
public class MyQueue {
    public void given3NumbersAddedToQueue(){
        MyNode<Integer> myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer> myThirdNode = new MyNode(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && myFirstNode.getNext().getNext().equals(myThirdNode);
        myLinkedList.enqueue_front(56);
        myLinkedList.getfront();
        myLinkedList.getrear();
        myLinkedList.dequeue_front();
        myLinkedList.dequeue_rear();
        Assert.assertTrue(result);
    }
}

