class Tv {
    String color;
    boolean power;
    int channel;

//    void power();
//    void channelUp();
//    void channelDown();

}

class chapter6 {
    public static void main (String[] args){
        Tv t1 = new Tv();
        System.out.println("t1의 channel값은"+ t1.channel + "입니다");
        t1.channel = 7;
        System.out.println("t1의 channel값은"+ t1.channel + "입니다");

    }
}