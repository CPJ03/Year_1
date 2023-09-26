public class Rectangle{
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