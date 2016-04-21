import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CoinTest {

  @Test
  public void checkCoin_testForOneQuarter_1() {
    Coin testCoin = new Coin();
    ArrayList<Integer> expected = new ArrayList();
    expected.add(1);
    expected.add(0);
    expected.add(0);
    expected.add(0);
    assertEquals(expected, testCoin.checkCoin(25));
  }

}
