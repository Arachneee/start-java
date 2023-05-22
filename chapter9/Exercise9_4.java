package chapter9;

class Exercise9_4 {
    static void printGraph(int[] dataArr, char ch) {
        for(int i:dataArr){
            for(int j=0;j<i;j++){
                System.out.print(ch);
            }
            System.out.println(i);
        }
/*
(1) printGraph . 메서드를 작성하시오
*/
    }
    public static void main(String[] args) {
        printGraph(new int[]{3,7,1,4},'*');
    }
}

