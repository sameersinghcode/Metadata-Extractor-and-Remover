import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.Scanner;

public class Short_Trick_Code{
    public static void main(String args[])throws IOException{
        BufferedImage image = null;
        File f = null;
        Scanner s = new Scanner(System.in);

        //read image file
        try{
            String path = JOptionPane.showInputDialog(null,"Enter the Path of Image");
            f = new File(path);
            image = ImageIO.read(f);
        }catch(IOException e){
            System.out.println("Error: "+e);
        }

        //write image
        try{
            f = new File("D:\\JAVA\\METADATA_PROJECT\\Output.jpg");
            ImageIO.write(image, "jpg", f);
            System.out.println("New Image without Exif Details is generated");
        }catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
}
