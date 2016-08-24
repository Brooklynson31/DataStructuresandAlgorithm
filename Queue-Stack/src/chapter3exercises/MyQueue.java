package chapter3exercises;

public class MyQueue<T> {
	private static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
	}
	
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	
	public T pop(){
		return null;
		
	}
	public void push(T object){
		
	}
	public T peek(){
		return null;
	}
	public boolean isEmpty() {
		return false;
	}
}
