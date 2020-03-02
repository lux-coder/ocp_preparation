class Message {
    public void printMessage() {
        System.out.println("Hello!");
    }
}
 
public class TestInnerAnonymus {
    public static void main(String[] args) {
        Message msg = new Message() {
            public void PrintMessage() {
                System.out.println("HELLO!");
            }
        };
        msg.PrintMessage();
    }
}