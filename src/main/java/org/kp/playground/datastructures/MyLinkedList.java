package home.datastructures;

public class MyLinkedList<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	MyNode topNode;
	int size = 0;

	
	public MyLinkedList() {

		// empty list
		topNode = new MyNode(null, null, null);
		topNode.next = topNode.prev = topNode;
		size++;

	}

	public void add(int index, Object element) {

		if (index < size) {
			
			

		}

	}

	public void get(int index) {

	}

	class MyNode<T> {

		T e;
		MyNode next;
		MyNode prev;

		public MyNode(T e, MyNode next, MyNode prev) {
			this.e = e;
			this.next = next;
			this.prev = prev;

		}

		public MyNode getNext() {
			return next;
		}

		public void setNext(MyNode next) {
			this.next = next;
		}

		public MyNode getPrev() {
			return prev;
		}

		public void setPrev(MyNode prev) {
			this.prev = prev;
		}

	}

}
