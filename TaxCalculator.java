public class TaxCalculator {
    private static final double INCOME_TAX_RATE = 0.1; // 10%

    public static double calculateIncomeTax(double income) {
        // Simple calculation, you may need to adjust based on your requirements
        return income * INCOME_TAX_RATE;
    }
}