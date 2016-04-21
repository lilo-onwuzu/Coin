import java.util.ArrayList;
import java.util.Arrays;

public class Coin {

  public ArrayList<Integer> checkCoin(Integer cent){
    ArrayList<Integer> newArrayList = new ArrayList<Integer>();
    newArrayList.add(0);
    newArrayList.add(0);
    newArrayList.add(0);
    newArrayList.add(0);
    Integer numQuarters;
    Number remQuarters;

    if (cent >= 25) {
      numQuarters = cent/25;
      remQuarters = cent%25;
      newArrayList.set(0,numQuarters);
    }
    return newArrayList;
  }
}
