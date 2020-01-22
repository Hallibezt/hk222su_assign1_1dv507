package hk222su_assign_1;

public class StackArray implements StringStack{
	private String[] stackArray;
	private int size = 0;//holds the actual size that is how many elements are in it (not the length including empty indexes)
	
	public StackArray() {
		this.stackArray = new String[10]; //Initiated with index of 10
	}
	
	private void sizeUp () {
		String[] larger = new String[this.stackArray.length + 10];
		for (int i =0; i<this.stackArray.length; i++) {//CHECK SKIP FIRST FOR LOOP
			for (int j = size; j>1; j--) {
				larger[j-1]=this.stackArray[j-1];
			}
		}
		this.stackArray = larger;
	}
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return size ==0;
	}

	@Override
	public void push(String element) {
		if (size>= this.stackArray.length) {
			sizeUp();
		}
		this.stackArray[size++]=element;
	}

	@Override
	public String pop() {		
		if (isEmpty() == true) {
			throw new ArrayStoreException("The list is empty - nothing to show");
		}
		String last = this.stackArray[size-1] ;	
		this.stackArray[size-1] = null;
		--size;
		return last;
	}

	@Override
	public String peek() {
		if (isEmpty() == true) {
			throw new ArrayStoreException("The list is empty - nothing to show");
		}
		String peek = this.stackArray[size-1];
		return peek;
	}

	

}
