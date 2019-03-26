package pkgShape;

public class Cuboid extends Rectangle {
	private double depth;

	public Cuboid(double width, double length, double depth) {
		super(length, width);
		this.depth = depth;
		
	}
	public double getDepth() {return depth;}
	public void setDepth(double newDepth) {
		this.depth = newDepth;
	}
	@Override
	public double area() {
		return (2 * width * length)+(2 * length * depth)+(2 * width * depth);
	}
	public double volume() {
		return width * length * depth;
	}
	public double SortByArea() {
		
		return this.area.compareTo(double sortA.area);
	}
	public double SortByVolume() {
		return this.volume.compareTo(double sortV.volume);
	}

}
