package Java;

import java.util.ArrayList;
import java.util.List;

public class Candie_kids {
    //if a kid with extra candies will have the most candies,display true.
    //else False. 
    public static void main(String[] args) {
        //Input
        int candies[]={2,3,5,1,3};
        int ExtraCandies=3;
        //Solutions
         List<Boolean> list = new ArrayList<>();
         int greatest = 0;
        for(int i=0;i<candies.length;i++){
             greatest = Math.max(candies[i] , greatest);
        }
        for(int i=0;i<candies.length;i++){
             int sum = candies[i] + ExtraCandies;
             if(sum >= greatest) list.add(true);
             else list.add(false);
        }
        //Output
        System.out.println(list);
    }
}
