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

  @Test
  public void checkCoin_testForMultipleQuarters_X() {
    Coin testCoin = new Coin();
    ArrayList<Integer> expected = new ArrayList();
    expected.add(2);
    expected.add(0);
    expected.add(0);
    expected.add(0);
    assertEquals(expected, testCoin.checkCoin(50));
  }

  @Test
  public void checkCoin_testForMultipleDime_X() {
    Coin testCoin = new Coin();
    ArrayList<Integer> expected = new ArrayList();
    expected.add(2);
    expected.add(1);
    expected.add(0);
    expected.add(0);
    assertEquals(expected, testCoin.checkCoin(60));
  }

  @Test
  public void checkCoin_testForMultipleNickels_X() {
    Coin testCoin = new Coin();
    ArrayList<Integer> expected = new ArrayList();
    expected.add(2);
    expected.add(1);
    expected.add(1);
    expected.add(0);
    assertEquals(expected, testCoin.checkCoin(65));
  }

  @Test
  public void checkCoin_testForMultiplePennies_X() {
    Coin testCoin = new Coin();
    ArrayList<Integer> expected = new ArrayList();
    expected.add(2);
    expected.add(1);
    expected.add(1);
    expected.add(3);
    assertEquals(expected, testCoin.checkCoin(68));
  }

  @Test
  public void checkCoin_testForZero() {
    Coin testCoin = new Coin();
    ArrayList<Integer> expected = new ArrayList();
    expected.add(0);
    expected.add(0);
    expected.add(0);
    expected.add(0);
    assertEquals(expected, testCoin.checkCoin(0));
  }
}
