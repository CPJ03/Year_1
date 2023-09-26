public class Square{
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