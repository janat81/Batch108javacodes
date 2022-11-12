package day32_practicesession;

import java.time.LocalDate;

public class Q02_MarketProductExpirationDate {

        //Type code to receive the name, price and expiration date of the product

        String productName;
        double productPrice;
        String expirationDate;

        public Q02_MarketProductExpirationDate(String name, double price, int monthLeft) {
            productName = name;
            productPrice = price;
            expirationDate= LocalDate.now().plusMonths(monthLeft).toString();

        }

        public Q02_MarketProductExpirationDate(String productName, double productPrice) {
            this.productName = productName;
            this.productPrice = productPrice;
        }
    }

