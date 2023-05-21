package chapter7;

class Exercise7_19 {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}
class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product cart index 배열 에 사용될
    void buy(Product p) {
        if (p.price > money) return;
        money -= p.price;
        add(p);
    }
    void add(Product p) {
        if (i > cart.length-1){
            Product[] cart2 = new Product[cart.length*2];
            for(int k=0;k<cart.length;k++){
                cart2[k] = cart[k];
            }
            cart = cart2;
        }
        cart[i] = p;
        i++;
    }
    void summary() {
        System.out.print("구입한 물건:");
        for (int i=0;i<cart.length;i++){
            System.out.printf(cart[i]+",");
        }
        System.out.println();
        System.out.println("사용한 금액:"+(1000-money));
        System.out.println("남은 금액:"+money);
    } // summary()
}
class Product {
    int price; // 제품의 가격
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}
class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}
