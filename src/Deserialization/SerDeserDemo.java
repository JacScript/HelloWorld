package Deserialization;

import java.io.*;

public class SerDeserDemo {
    public static void main(String[] args){
        Student student = new Student("John", 26, "Mbeya");
        student.setX(70);


        String fileName = "F:\\java-tutorial\\Text.file";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        //Serialization
        try{
            fileOut = new FileOutputStream(fileName);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized: \n" + student);

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        //Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream  objIn = null;
        try{
            fileIn = new FileInputStream(fileName);
            objIn = new ObjectInputStream(fileIn);


            Student object = (Student) objIn.readObject();

            System.out.println("Object has been deserialized: \n" + object);
            System.out.println("the deserialized value of x is: " + object.getX());

            objIn.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException" + " is caught");
        }

    }
}
