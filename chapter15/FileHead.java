package chapter15;

import java.io.*;

public class FileHead {
    public static void main(String[] args) throws IOException{
        if (args.length != 2) {
            System.out.println("USAGE: java FileHead 10 FILENAME");
        } else {
            int line = Integer.parseInt(args[0]);
            String fileName = args[1];
            try{
                BufferedReader br = new BufferedReader(new FileReader(fileName));

                for(int i=0;i<line;i++){
                    System.out.println(i+":"+br.readLine());
                }
                br.close();

            } catch (FileNotFoundException e) {
                System.out.println(fileName+"은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
            }
        }
        System.exit(0);
    }
}
