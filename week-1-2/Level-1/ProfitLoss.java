class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129, sellingPrice = 191; // [cite: 78]
        double profit = sellingPrice - costPrice; // [cite: 81]
        double profitPercentage = (profit / costPrice) * 100; // [cite: 82]
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage); // [cite: 85, 86]
    }
}