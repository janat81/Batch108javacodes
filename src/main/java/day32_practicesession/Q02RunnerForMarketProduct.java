package day32_practicesession;

public class Q02RunnerForMarketProduct {



        public static void main(String[] args) {

            Q02_MarketProductExpirationDate obj1= new Q02_MarketProductExpirationDate("Cheese", 24.99, 10);
            System.out.println(obj1.productName+ " " + obj1.productPrice+ "$ " + obj1.expirationDate);

            Q02_MarketProductExpirationDate obj2= new Q02_MarketProductExpirationDate("Milk", 4.99);
            System.out.println(obj2.productName+ " "+ obj2.productPrice+ "$ "+ obj2.expirationDate);

            Q02_MarketProductExpirationDate obj3= new Q02_MarketProductExpirationDate("Salt", 3.5);
            System.out.println(obj3.productName+ " "+ obj3.productPrice+ "$");




        }


    }

