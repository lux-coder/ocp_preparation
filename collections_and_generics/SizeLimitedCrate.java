public class SizeLimitedCrate<T, U>{
	private T contents;
	private U sizeLimit;
	
	public SizeLimitedCrate(T contents, U sizeLimit){
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}
	
	public static void main(String[] args){
		Elephant elephant = new Elephant();
		Integer numPounds = 12345;
		
		SizeLimitedCrate<Elephant, Integer> crate1 = new SizeLimitedCrate<>(elephant, numPounds);
	}
	
	
}