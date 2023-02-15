public class CalculatorTest {
    public static void main(String[] args) {
        testingDiscount(3000.00, 150);
    }

//    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
//
//        double price = purchaseAmount - (purchaseAmount / 100 * discountAmount);
//
//        return price;
//    }

    public static double testingDiscount (double purchaseAmount, int discountAmount) {
        double res = purchaseAmount - (purchaseAmount / 100 * discountAmount);

        return res;
        assert discountAmount > 0;
        assert discountAmount < 100;
        assert res < purchaseAmount;
    }
}