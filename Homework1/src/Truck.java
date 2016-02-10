public class Truck extends Vehicle{
	
	private int y;
	public Truck(int z) { super(z); y = z; };
	public Object clone() throws CloneNotSupportedException {
		Object result = super.clone();
		((Truck) result).y = this.y;
		return result;
	}
	public int getY() {
		return y;
	}
	
}
