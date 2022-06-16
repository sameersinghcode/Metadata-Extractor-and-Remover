import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter image absolute path: ");
        
        String abspath = JOptionPane.showInputDialog(null,"Enter the Path of Image");
        Runtime rt = Runtime.getRuntime();
        String[] commands = {"python3", "main.py", abspath};
        
        try {
            Process proc = rt.exec(commands);
            BufferedReader stdInput = new BufferedReader(new 
            InputStreamReader(proc.getInputStream()));

            BufferedReader stdError = new BufferedReader(new 
            InputStreamReader(proc.getErrorStream()));

            String j = null;
            while ((j = stdInput.readLine()) != null) {
                System.out.println(j);
            }
            while ((j = stdError.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (IOException e) {
            System.out.println("error!");
            e.printStackTrace();
        }

    }
}
