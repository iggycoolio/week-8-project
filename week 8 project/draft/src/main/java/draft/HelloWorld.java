package draft;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String... args) throws IOException{
       String path = "src/main/java/draft/Sample100.csv" ; //what to read
       String line = " ";
       String data = "data_sorted.txt";
       String separator = " ";
// new inputstream(s)
        FileInputStream fileInputStream1 = null;
        FileInputStream fileInputStream2 = null;
        FileOutputStream fileOutputStream = null;
        SequenceInputStream sequenceInputStream = null;


       try { // try catches are great for text files tom display possible errors
            fileInputStream1 = new FileInputStream("data_sorted.txt");// files you want to sequence
            fileInputStream2 = new FileInputStream("sample100.csv");

            fileOutputStream = new FileOutputStream("GoodData.txt");// file the output will be placed into

            Vector<FileInputStream> vector = new Vector<FileInputStream>();// vector objects
            vector.add(fileInputStream1);
            vector.add(fileInputStream1);

            Enumeration<FileInputStream> enumeration = vector.elements();// the vectors return enumerations

            sequenceInputStream = new SequenceInputStream(enumeration);
            int i;
            while ((i = sequenceInputStream.read()) != -1){
                fileOutputStream.write(i);
            }


    BufferedReader dr = new BufferedReader(new FileReader(data)); // buffered readers are great for large files
    while((line = dr.readLine()) != null) { //while reading the line, the system will parse according to commas 
        String[] str = separator.split(" ,");
    

    BufferedReader br = new BufferedReader(new FileReader(path)); // buffered readers are great for large files
    while((line = br.readLine()) != null) { //while reading the line, the system will parse according to commas 
        String[] values = line.split(",");
    
   
    br.close();
    dr.close();
System.out.println(str[1] + values[1] );}}

}
finally
{
    if (fileInputStream1 != null)
    {fileInputStream1.close(); 
    }
    if (fileInputStream2 != null)
    {fileInputStream2.close(); 
}
if (fileOutputStream != null)
    {fileOutputStream.close(); 
}
if (sequenceInputStream != null)
    {sequenceInputStream.close(); 
} 
 {
    //TODO: handle exception
}}
}
}