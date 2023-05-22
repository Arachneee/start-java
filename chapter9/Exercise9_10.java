package chapter9;

class Exercise9_10
{

    static String format(String str, int length, int alignment){
        if (length < str.length()) return str.substring(0,length);

        StringBuffer sb = new StringBuffer(str);
        if (alignment == 0){
            for(int i=0;i<length-str.length();i++)
                sb.append(" ");
        } else if (alignment == 2){
            for(int i=0;i<length-str.length();i++)
                sb.insert(0," ");
        } else if (alignment == 1){
            for(int i=0;i<(int)((length-str.length())/2);i++){
                sb.insert(0," ");
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str,7,0)); // 왼쪽 정렬
        System.out.println(format(str,7,1)); // 가운데 정렬
        System.out.println(format(str,7,2)); // 오른쪽 정렬
    }
}
