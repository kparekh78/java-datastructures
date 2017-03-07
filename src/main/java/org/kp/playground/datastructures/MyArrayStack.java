package home.datastructures;

public class MyArrayStack<T> {

	public static void main(String[] args) {
		
		System.out.println("test");
		

	}
	//initial capacity
	private static  int initialCap = 0;
	
	//default capacity
	private static final int defaultCap= 10;
	//size
	
	//array
	Object[] stackArray;
	T top;
	
	//constructor
	public MyArrayStack(int initCap){
		
		initialCap = initCap;
		stackArray = new Object[initCap];
		
	}
	
	
	//push method
	public void push(T element){
		if(top == null){
			top = element;
			stackArray[0] = top;
		}else{
			
			
			
			
		}
		
		
	}
	
	
	//pop method
	
	
	
	
	
	
	
}
