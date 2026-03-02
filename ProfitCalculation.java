public class ProfitCalculation {

    public static void main(String[] args) {

        // Given values
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit
        int profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / (double) costPrice) * 100;

        // Single print statement with multiline output
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}