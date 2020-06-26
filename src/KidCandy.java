import java.util.ArrayList;
import java.util.List;

public class KidCandy {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> answer = new ArrayList<Boolean>();
        int maxValue = 0;
        for(int i = 0; i<candies.length; i++){
            candies[i] = candies[i]+extraCandies;
            if(candies[i]>maxValue){
                maxValue = candies[i];
            }
        }

        for(int i = 0; i<candies.length; i++){
            if(candies[i]+extraCandies>=maxValue){
                answer.add(true);
            }
            else{
                answer.add(false);
            }
        }

        return answer;

    }
}



