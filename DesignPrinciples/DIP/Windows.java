package DIP;

public class Windows implements Keyboard, Mouse{
    private final Keyboard keyboard;  // in this we have taken the interface object
    private final Mouse mouse;  // in this we have taken the interface object

    public Windows(){ //constructor injection
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
