class MyException extends RuntimeException {}
 
class YourException extends RuntimeException {}
 
public class TestSwallowException {
    public static void main(String[] args) {
        try {
            throw new YourException();
        } catch(MyException | YourException e){
            e = null;
        }
    }
}