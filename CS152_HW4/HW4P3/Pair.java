/*
n class we studied a generic Pair class where the base type had to extend the
Comparable interface. Write a compareTo method for this class which first compares the first
elements of both objects and only when they are equal does it compare the second elements. 
*/
public class Pair <T extends Comparable> {
	
	protected T first;
	protected T second;
		
		public Pair() {
		first = second = null;
	}
		
		public Pair(T val1, T val2) {
			first = val1;
			second = val2;
		}
		
		public T getFirst() {
			return first;
		}
		
		public T getSecond() {
			return second;
		}
		
		public void setFirst(T val) {
			first = val;
		}
		
		public void setSecond(T val) {
			second = val;
		}
		
		public String toString() {
			return "[" + first + "," + second+ "]";
		}

		public boolean equals(Object other) {
			if (other == null)
				return false;
			else if(getClass() != other.getClass())
				return false;
			else {
				Pair<T> otherPair = (Pair<T>) other;
				return (first.equals(otherPair.first) && second.equals(otherPair.second));
			}
		}

//3
	public boolean compareTo(Pair<T> object) {
		if(first.equals(object.getFirst())) {
			if(second.equals(object.getSecond())) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
