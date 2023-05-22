package chapter9;

class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        int num = fullPath.indexOf("\\Path");
        path = fullPath.substring(0,num);
        fileName = fullPath.substring(num+1,fullPath.length());

/*
(1) . 알맞은 코드를 넣어 완성하시오
*/
        System.out.println("fullPath:"+fullPath);
        System.out.println("path:"+path);
        System.out.println("fileName:"+fileName);
    }
}

