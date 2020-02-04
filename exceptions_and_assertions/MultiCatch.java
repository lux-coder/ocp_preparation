public class MultiCatch{
	
	public static void main(String[] args){

		//duplicating code
/* 		try{
			Path path = Paths.get("dolphinsBorn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		} catch(DateTimeParseException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch(IOException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		} */
		
		//catch Exception insted of specific types or create helper method
/* 		try{
			Path path = Paths.get("dolphinsBorn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);			
		} catch(Exception e){  //BAD
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch(DateTimeParseException e){
			handleException(e);
		} catch(IOException e){
			handleException(e);
		}
		
		private static void handleException(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		} */
		
		try{
			Path path = Paths.get("dolphinsBorn.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);
			System.out.println(date);
		}catch(DateTimeParseException | IOException e){
			e.printStackTrace();
			throw new RuntimeException(e)
		}
		
	}
	
}