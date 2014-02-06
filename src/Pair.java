import java.io.Serializable;


public class Pair<T extends Serializable> {
	T first;
	T second;
	
	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	public T getFirst(){
		return first;
	}
	
	public T getSecond(){
		return second;
	}
	
}
