class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }

}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;

    public static int ps = 10;
}
class chapter6 {
    public static void main (String[] args){
        Tv[] tvArr = new Tv[3];

        //객체배열 생성 후 각 요소를 초기화 해야한다.
        for(int i=0;i< tvArr.length;i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
            tvArr[i].color = Integer.toString(i%3);
        }

        for(Tv tv:tvArr){
            System.out.println("tv.chanel = " + tv.channel);
            System.out.println("tv.color = " + tv.color);
        }

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Space";
        c2.number = 4;

        System.out.println("c1 = " + c1.kind + " of " + c1.number + " W :" + c1.width + " H " + c1.height);
        System.out.println("c2 = " + c2.kind + " of " + c2.number + " W :" + c2.width + " H " + c2.height);

        c1.width = 50;
        c2.height = 100;
        System.out.println("change");
        System.out.println("c1 = " + c1.kind + " of " + c1.number + " W :" + c1.width + " H " + c1.height);
        System.out.println("c2 = " + c2.kind + " of " + c2.number + " W :" + c2.width + " H " + c2.height);
        System.out.println(c1.ps);
        //Card.ps = 50;
        System.out.println(c2.ps);
    }
}