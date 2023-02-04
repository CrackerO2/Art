import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

public class ASCII_Art
{

    public static void main(String[] args)
    {
        File image = new File("/Users/shrabin/Desktop/Project_Files/Java/Art/mario_jump.jpeg"); //add path of the file
        int height = 0;
        int width = 0;

        Date x = new Date();

        try {
            
            height = ImageIO.read(image).getTileHeight();
            width = ImageIO.read(image).getTileWidth(); 
        } catch (IOException e) {
        }

        System.out.println(x.getTime());
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                try{       
                    if(ImageIO.read(image).getRGB(j, i) == -1){
                        System.out.print("00");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                catch (IOException e)
                {}
            }
            System.out.println();
        }
        
        System.out.println(x.getTime());
    }

    
} 