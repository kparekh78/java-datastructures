package home.datastructures;

public class MyLinkedStack<T> {

	public static void main(String[] args) {
		new MyLinkedStack<String>().test();

	}

	public void test() {

		MyLinkedStack<String> stack = new MyLinkedStack<String>();

		Node<String> node1 = new Node<String>();
		node1.data = "node1";
		stack.push((MyLinkedStack<String>.Node<String>) node1);
		//System.out.println(stack.pop().data);
		
		Node<String> node2 = new Node<String>();
		node2.data = "node2";
		stack.push((MyLinkedStack<String>.Node<String>) node2);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);



	}

	Node<T> top;

	public MyLinkedStack() {

		top = null;

	}

	public void push(Node<T> node) {

		//Node<T> tempTop = top;
		
		if (top != null) {
			node.next = top;

		}
		top = node;

	}

	public Node<T> pop() {

		Node<T> tempTop = top;
		top = top.next;
		return tempTop;
	}

	class Node<T> {

		T data;
		Node<T> next;

	}

}
