import java.util.ArrayList;
import java.util.Arrays;

public class Coin {

  public ArrayList<Integer> checkCoin(Integer cent){
    ArrayList<Integer> newArrayList = new ArrayList<Integer>();
    newArrayList.add(0);
    newArrayList.add(0);
    newArrayList.add(0);
    newArrayList.add(0);

    while (cent >= 25) {
      Integer numQuarters = cent/25;
      cent = cent%25;
      newArrayList.set(0,numQuarters);
     while (cent >= 10){
        Integer numDimes = cent/10;
        cent = cent%10;
        newArrayList.set(1,numDimes);
         while (cent >= 5) {
           Integer numNickels = cent/5;
           cent = cent%5;
           newArrayList.set(2,numNickels);
        }
      }
    }
    return newArrayList;
  }
}
