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
            myLinkedList.pop();
            myLinkedList.pop();
            myLinkedList.pop();
            Assert.assertTrue(result);
        }
    }
}
