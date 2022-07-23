public class SalesManager {
    protected long[] sales;
    protected long min;
    protected long max;
    protected long sum=0;

//    public SalesManager(long[] sales) {
//    }


    public  SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = sales [0];
        for (int i =0;i<sales.length;i++){

            if (sales[i]<min){
            min=sales[i];
        }
        else {
        min = sales [0];}
        }
        return min;
    }
    public long average (){
        min = min();
        max = max();
     for (int i=0;i<sales.length;i++){
         sum+=sales[i];
     }
        long generalAverage = (sum-max-min)/(sales.length-2);
     return generalAverage;
    }




}