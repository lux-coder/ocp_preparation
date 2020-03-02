class Message {
    public void printMessage() {
        System.out.println("Hello!");
    }
}
 
public class TestOverride {
    public static void main(String[] args) {
        Message msg = new Message() {
            @Override
            //public void PrintMessage() {
            public void printMessage() {
                System.out.println("HELLO!");
            }
        };
        msg.printMessage();
    }
}