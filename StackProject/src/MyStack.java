public class MyStack {
	private SinglyLinkedList list;
	
	public MyStack() {
		list = new SinglyLinkedList();
	}

	public int peekTop() {			
		return list.getFirst();
	}

	public int pop() {
		int top = list.getFirst();
		list.remove();
		return top;
	}

	public void push(int num) {
		list.addFirst(num);
	}

	public int size() {
		return 0;
	}
}
