package day31_practicesession;

public class Q02_RunnerForMarketProduct {



        public static void main(String[] args) {

            Q02_MarketProductExpDate obj1=new Q02_MarketProductExpDate("Cheese", 10.29, 10);

            System.out.println(obj1.productName+ " " + obj1.productPrice + "$ " + obj1.expirationDate);

            Q02_MarketProductExpDate obj2= new Q02_MarketProductExpDate("Milk", 4.99);
            System.out.println(obj2.productName+ " "+ obj2.productPrice+ "$");

            Q02_MarketProductExpDate obj3= new Q02_MarketProductExpDate("Salt", 3.5);

            System.out.println(obj3.productName+ " "+ obj3.productPrice+ "$");

        }

    }

