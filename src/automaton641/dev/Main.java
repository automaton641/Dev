package automaton641.dev;

import automaton641.lib.LibTerminal;
import automaton641.lib.LibWindow;

public class Main {
    public static void main(String[] args) {
        LibWindow window = new LibWindow("Dev");
        window.addTextComponent(new String[]{"Welcome to DEV the game!", "click here to continue..."});
        window.show();
    }
}
