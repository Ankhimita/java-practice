package practice2;

public class StockBuySell {

    public static void main(String[] args) {
        int[] stocks = new int[]{100, 180, 260, 310, 30, 20, 50, 695};

        int profit=0;

        for(int i=0; i<stocks.length-1; i++){
            if(stocks[i+1]>stocks[i]){
                profit= profit+ (stocks[i+1]-stocks[i]);
            }
        }

        System.out.println("profit=" + profit);
        System.out.println("Expected Output: " + ((310-100)+(695-20)));
    }


}
