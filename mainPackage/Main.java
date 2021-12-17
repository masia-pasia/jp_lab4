package mainPackage;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {new MainFrame("Main menu").start();});
    }
}
