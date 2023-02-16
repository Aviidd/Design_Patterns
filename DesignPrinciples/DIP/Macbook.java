package DIP;

public class Macbook implements Keyboard, Mouse{
     final WiredKeyboard keyboard;  // taken the concrete class object
     final WiredMouse mouse; // class become highly coupled
    // not a recommended method
    public Macbook(){
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}
