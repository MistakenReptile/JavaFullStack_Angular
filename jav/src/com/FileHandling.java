package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CreateFile{
    public static void writer() throws IOException {
        String str="Dummy text Dummytext Dummy Text";
        FileWriter fileWriter = new FileWriter("fileoutput.txt");
        for (int i=0;i<str.length();i++){
            fileWriter.write(str.charAt(i));
        }
        System.out.println("Writing Successfull!");
        fileWriter.close();
    }
}
class ReadFile{
    public static void reader() throws IOException{
        int ch;
        FileReader fileReader=null;
        try {
            fileReader=new FileReader("fileoutput.txt");
        }
        catch (FileNotFoundException fe){
            System.out.println("File Not Found");
        }
        while ((ch=fileReader.read())!=-1){
            System.out.println((char)ch);
        }
        fileReader.close();
    }
}
public class FileHandling {
    public static void main(String[] args) throws IOException {
        CreateFile wobj=new CreateFile();
        wobj.writer();

        ReadFile robj=new ReadFile();
        robj.reader();
    }
}
