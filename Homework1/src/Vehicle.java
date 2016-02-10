
public class Vehicle implements Cloneable {

	private int x;
	public Vehicle(int y) {setX(y);}
	public Object clone() throws CloneNotSupportedException {
		Object result = super.clone();
		return result;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}




