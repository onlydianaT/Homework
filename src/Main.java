public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{5, 10, 20, 30});
        System.out.println(salesManager.max());
    }
}
