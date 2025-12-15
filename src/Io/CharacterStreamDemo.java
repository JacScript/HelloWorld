package Io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;


        try{
            reader = new FileReader("/Users/apple/Downloads/impo/JAVA TUTO/java-files/source.txt");
            writer = new FileWriter("/Users/apple/Downloads/impo/JAVA TUTO/java-files/dest.txt");

            //read a byte at a time, if it reaches end of the file, return -1
            int content;
            while((content = reader.read()) != -1){
                writer.append((char) content);
            }
        } finally {
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }
    }
}
