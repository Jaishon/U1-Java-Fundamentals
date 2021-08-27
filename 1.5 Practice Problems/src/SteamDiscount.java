public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {

        double gamePrice = 60.00;
        double discount  = 20.0;
        double discountPrice = gamePrice - (gamePrice * discount / 100);
        int sumTotal = (int) discountPrice;

        System.out.println("The new price is " + sumTotal);


    }



}

