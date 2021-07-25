package collection;

import java.util.ArrayList;

class MyStack {

	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("������ ����ֽ��ϴ�.");
			return null;
		}
		return arrayStack.remove(len-1);
	}
	
}

public class StackTest{
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("X");
		stack.push("Y");
		stack.push("Z");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}









