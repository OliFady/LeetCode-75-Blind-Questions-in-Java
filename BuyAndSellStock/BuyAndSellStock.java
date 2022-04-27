package com.company;

public class BuyAndSellStock {

    public int maxProfit(int[] prices) {

        int min=prices[0],index=0,max=0;
        boolean maxFound = false;

        for (int i=0;i<prices.length;i++) {
            if (min > prices[i] ) {
                min = prices[i];
                index= i;
            }
        }

      while (index <prices.length){
          if (max < prices[index]){
              max =prices[index];
              maxFound=true;
          }
          index++;
      }

      if (maxFound == true){
          return max - min;
      }
      else return 0;
    }
}
