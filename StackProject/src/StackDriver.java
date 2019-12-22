public class StackDriver {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.peekTop();
	}
}