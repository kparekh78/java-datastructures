package home.datastructures;

public class MyLinkedQueue<T> {

	public static void main(String[] args) {
		new MyLinkedQueue<String>().test();

	}

	public void test() {

		MyLinkedQueue<String> stack = new MyLinkedQueue<String>();

		Node<String> node1 = new Node<String>();
		node1.data = "node1";
		stack.push((MyLinkedQueue<String>.Node<String>) node1);
		//System.out.println(stack.pop().data);
		
		Node<String> node2 = new Node<String>();
		node2.data = "node2";
		stack.push((MyLinkedQueue<String>.Node<String>) node2);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);



	}

	Node<T> end;

	public MyLinkedQueue() {

		end = null;

	}

	public void push(Node<T> node) {

		//Node<T> tempTop = top;
		
		if (end != null) {
			end.next = node;

		}else{
			end = node;
		}

	}

	public Node<T> pop() {

		Node<T> tempEnd = end;
		end = end.next;
		return tempEnd;
	}

	class Node<T> {

		T data;
		Node<T> next;

	}

}
