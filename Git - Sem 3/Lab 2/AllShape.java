package AllShape;

class Rectangle{
	// Attributes 
	private float length;
	private float width;
	
	// Methods
	
	public void setLength(float newLength){
		this.length = newLength;
	}
	public float getLength(){
		return length;
	}
	public void setWidth(float newWidth){
		this.width = newWidth;
	}
	public float getWidth(){
		return width;
	}
	public float calcArea(){
		return (width*length);
	}
}
class Square{
	// Attributes 
	private float length;
	
	// Methods
	public void setLength(float newLength){
		this.length = newLength;
	}
	public float getLength(){
		return length;
	}
	public float calcArea(){
		return (length*length);
	}
}
class Circle{
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