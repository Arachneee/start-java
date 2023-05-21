class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    // info() Object toString() . 대신 클래스의 을 오버라이딩했다
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for(int i=0;i < CARD_NUM;i++){
            int mod = i%10+1;
            boolean isKwang = (i<10) &&(mod==1||mod==3||mod==8);
            cards[i] = new SutdaCard(mod,isKwang);
        }
    }
    void shuffle() {
        for(int i=0;i<CARD_NUM;i++){
            int id = (int)(Math.random()*CARD_NUM);
            SutdaCard temp = cards[i];
            cards[i] = cards[id];
            cards[id] = temp;
        }
    }
    SutdaCard pick(int index){
        if(index <0|| index >= CARD_NUM)
            return null;
        return cards[index];
    }
    SutdaCard pick(){
        return cards[(int)(Math.random()*CARD_NUM)];
    }


}

class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

