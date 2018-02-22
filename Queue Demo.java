package assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment2 {
	public static void main(String args[]){
		Queue<Integer> mynumbers = new LinkedList<Integer>();

		mynumbers.add(4);
		mynumbers.add(5);
		mynumbers.add(6);
		mynumbers.add(10);
		System.out.println("the numbers in the queue are " + (mynumbers.size()));
		System.out.println("the front number in the queue is " + mynumbers.peek());
		mynumbers.remove();
		mynumbers.remove();
		System.out.println("the numbers in the queue are " + (mynumbers.size()));
	}
}
