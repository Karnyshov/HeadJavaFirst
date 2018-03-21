package Chapter1;

public class BeerBottles {

    public static void main(String[] args) {
        int beerNum = 10;
        String word = "бутылок (бутылки)";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "бутылка";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum = beerNum - 1;
            if (beerNum == 0) {
                System.out.println("Нету бутылок пива на стене");
            }
        }
    }
}