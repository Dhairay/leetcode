package practice.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileHandelingViaLocalFile {
    // Method 4
    //creating the List to read the txt file
    public static List<String> ls=new LinkedList<>();


    public static void main(String[] args) throws Exception {

//Method - 1
       /* //Buffer Reader Class for readinf text file.

        File file = new File("C:\\Users\\Dhair\\IdeaProjects\\BaseCode.txt");
        //Note:- Double Backquote is to avoid Compiler
        //Interprete Words

        //Creating an object of BufferReader class

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        //There is a character in a string

        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }*/
//Method - 2
        /*// FileReader class for reading text file
        FileReader file = new FileReader("C:\\Users\\Dhair\\IdeaProjects\\BaseCode.txt");

        int i;

        //Creat the loop from start to end
        while((i=file.read())!=-1){
            System.out.print((char)i);
        }*/
//Method - 3
       /*  //Scanner class for reading text file
        File file=new File("C:\\Users\\Dhair\\IdeaProjects\\BaseCode.txt");
        Scanner sc=new Scanner(file);

        //Loop to read text in txt file
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }*/
//Method - 4
        //Reading the whole file in a List


    }

}
