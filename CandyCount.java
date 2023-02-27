class CandyCount {
    public static void main(String[] args) {

       double money = 12.4;
       double price = 1.2;
       int candy = 0;
       if ( money > 0 && price > 0){ 
          while(( money - price)>= 0){
        candy = candy + 1;
        money = money - price;
    } }
    System.out.println(candy);
    }
}
