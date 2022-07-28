public class SalesManager {
    protected int[] sales;
    protected int min;
    protected int max;
    protected int sum = 0;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < min) {
                min = sales[i];
            } else {
                min = sales[0];
            }
        }
        return min;
    }

    public int average() {
        min = min();
        max = max();
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int generalAverage = (sum - max - min) / (sales.length - 2);
        return generalAverage;
    }


}