public class Circle{
	// Attributes 
	private float radius;
	
	// Methods
	public void setRadius(float newRadius){
		this.radius = newRadius;
	}
	public float getRadius(){
		return radius;
	}
	public float calcArea(){
		return ((22/7)*radius*radius);
	}
}