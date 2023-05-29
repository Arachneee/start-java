package chapter15;

import java.io.*;
import java.util.*;

public class FileMergeTest {
    public static void main(String[] args) throws IOException{
        if (args.length < 2){
            System.out.println("USAGE: java FileMergeTest MERGE_FILENAME FILENAME1 FILENAME2 ...");
            System.exit(0);
        }

        FileOutputStream fos = new FileOutputStream(args[0]);

        for(int i=1;i<args.length;i++){
            FileInputStream fis = new FileInputStream(args[i]);
            int data = 0;
            while((data=fis.read())!= -1){
                fos.write(data);
            }
            fos.write("\n".getBytes());
            fis.close();
        }
        fos.close();
    }
}
