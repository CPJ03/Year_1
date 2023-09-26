public class Bag{
	// Attributes
	private int bagSize = 10;
	private int[] arrBag;
	
	
	// Method
	public Bag(bagSize){
		arrBag = new int[bagSize];
	}
	
	public boolean add(int entry){
		if (arrBag.length < bagSize){
			arrBag[entry];
			return true;
		}
		else{
			return false;
		}
	}
	
	public void remove(entry){ // check occurance KIV
		for (int i = 0; i < arr.Length; i++){
			if (entry == arrBag[i]){
				for (int j = i; j < bagSize; j++){
					arrBag[j] = arrBag[j+1];
				}
			}
		}
	}
	
	public int calcSize(){
		
	}
	
	public int countOccur(){
		
	}
	
		
	public static void main(String[] args){
		
	}
}

