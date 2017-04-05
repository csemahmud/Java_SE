/**
 * 
 */
package com.mahmud.SampleStackAppPackage.classes;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MyStack<Type> {
	
	private final Type stack[];
	private int top;

	/**
	 * @param maxSize
	 * 
	 */
	@SuppressWarnings("unchecked")
	public MyStack(int maxSize) {
		// TODO Auto-generated constructor stub
		stack = (Type[]) new Object[maxSize];
	}

	/**
	 * 
	 */
	public MyStack() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	
	public void push(Type element) throws OverflowStackException{
		if(top < stack.length){
			stack[top++] = element;
		} else {
			throw new OverflowStackException();
		}
	}
	
	public Type pop() throws UnderflowStackException{
		if(top > 0){
			return stack[--top];
		}
		throw new UnderflowStackException();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyStack [stack={");
		if(top > 0){
			builder.append(stack[0]);
		}
		for(int i = 1; i < top; i++){
			builder.append(", ").append(stack[i]);
		}
		builder.append("}").append(", top=").append(top).append("]");
		return builder.toString();
	}

}
