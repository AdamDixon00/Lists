package hw02;

import java.util.Random;
/**
 * Name:        Adam Dixon
 * CIN:         304772993
 * Course:      Programming with Data Structures
 * Section:     CS-2013
 * Description: This class creates an empty list with spaces based on the given size.
 */
public class CustomList<E extends Comparable<E>> {
	    private E[] data;
		//Creates an empty list with spaces based on the given size.
	    //NOTE: This constructor is only used to help implement some methods 
	    //		later in the class.
	    private CustomList(int size) {
	        this.data = (E[])(new Comparable[size]);
	    }

	    //This constructor can accept an array or a comma-separated list of values.
	    public CustomList(E ... elements) {
	        this.data = (E[])(new Comparable[elements.length]);
	        //Make a deep copy to prevent shared references.
	        System.arraycopy(elements, 0, this.data, 0, elements.length);
	    }
	    
	    public E get(int index) throws ArrayIndexOutOfBoundsException {
			if (index < 1 || index >= this.size()) {
				
				throw new ArrayIndexOutOfBoundsException("That index is out of bounds.");
			} 
			return this.data[index];
	    }
	  
	    public CustomList<E> get(int start, int end) throws ArrayIndexOutOfBoundsException {
				if (start<1 || end>=this.size() || start > end) {
					throw new ArrayIndexOutOfBoundsException("This is an out of bounds value");
				}
				int listSize = (end - start)+1;
				CustomList<E> list = new CustomList<>(listSize);
				for(int i = 0; i<listSize;i++) {
					list.data[i] = this.data[start+i];
				}
				return list;
			}
	    
	    public void put(int index, E value) throws ArrayIndexOutOfBoundsException {
	    	if (index < 1 || index >= this.size()) {
				throw new ArrayIndexOutOfBoundsException("This index is out of bounds.");
			}
			data[index] = value; 

	    }
	    
	    public void put(int start, int end, E ... values) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
			if (start < 1 || end >= this.size() || end < start) {
				throw new ArrayIndexOutOfBoundsException("This start or end is out of bounds.");
				}
				if (end-start+1 != values.length) {
					throw new ArrayIndexOutOfBoundsException("This value is not in bounds.");
				}
					int index = 0;
					for (int i = start; i < end; i++) {
						this.put(i, values[index]);
						index++;
					}
	    }
	    
	    public void reverse() {
			int first = 0;
			int last = this.size()-1;
			while(first<last){
				E swap = this.data[first];
				this.data[first] = this.data[last];
				this.data[last] = swap;
				first ++;
				last --;
			}
		
		}
	    
	    public void shuffle() {
			Random random = new Random();
			for (int i = this.size()-1; i>0;i--){
				int index = random.nextInt(i);
				E mix = data[i];
				data[i] = data[index];
				data[index] = mix;
			}

	    }
	    
	    public int size() {
	    	return data.length;
	    }
	    
	    @Override
	    public String toString() {
	    	String newString = "[";
			for (int i = 0;i < data.length;i++){
				newString += (data[i].toString());
				if(i<data.length-1){
					newString += (",");

				}
			}
				newString += ("]");
				return newString;
	    }
	    
	    public void sort() {
				boolean sortIt = false;
				int var = this.size();
				while (!sortIt) {
					sortIt = true;
					for (int i = 1; i <  var; i++) {
						if (data[i].compareTo(data[i-1])<0) {
							E newData = data[i];
							data[i] = data[i-1];
							data[i-1] = newData;
							sortIt = false;
						}
					}
					var--;
				}
			}
			
		
}

