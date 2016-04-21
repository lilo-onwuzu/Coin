import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void homeTest() {
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Coin Count");
  }

  @Test
  public void resultsTest(){
    goTo("http://localhost:4567");
    fill("#useInput").with("25");
    submit(".btn");
    assertThat(pageSource()).contains("Your change is");
  }
}
