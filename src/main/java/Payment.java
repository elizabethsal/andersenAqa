import java.util.ArrayList;

public class Payment {


    String[] names = {"Fluffy cat", "Wallet", "Wooden penguin", "Almond milk", "Monstera", "Eco Coat", "Reusable tube", "Peanut butter(no sugar)"};
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 7;
    private static final int MAX_PRICE = 70;
    ArrayList<Good> receipt = new ArrayList<>();

    @Override
    public String toString() {
        String rv = "";
        for (int i = 0; i < receipt.size() - 1; i++) {
            rv += receipt.get(i) + "\n";
        }
        return rv;
    }

    public Payment() {
        for (int i = 0; i < getRandomNumber(MIN_VALUE, MAX_VALUE); i++) {
            receipt.add(new Good(names[getRandomNumber(0, names.length - 1)], getRandomNumber(0, MAX_PRICE)));
        }
    }

    public class Good {
        private String name;
        private int price;

        public Good(String name, int price) {

            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Name of good: " + name + " price: " + price;
        }
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
