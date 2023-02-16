import seminars.first.model.Calculator;
import static org.assertj.core.api.Assertions.assertThat;
public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(CalculatorTest.testingDiscount(3000.00, 15)).equals(2550.00);
        assertThat(CalculatorTest.testingDiscount(3000.00, -15)).isEqualTo(false);

        assert discountAmount > 0;
        assert discountAmount < 100;
        assert res < purchaseAmount;
    }
    public static double testingDiscount (double purchaseAmount, int discountAmount) {
        double res = purchaseAmount - (purchaseAmount / 100 * discountAmount);

        return res;

    }
}