import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Coin {
  public static void main(String[] args){
    Coin newCoin = new Coin();

    String layout = "templates/layout.vtl";

    get ("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/results.vtl");
      Integer importInput = Integer.parseInt(request.queryParams("userInput"));
      ArrayList<Integer> resFull = new ArrayList<Integer>(newCoin.checkCoin(importInput));
      Integer resQuarters = resFull.get(0);
      Integer resDimes = resFull.get(1);
      Integer resNickels = resFull.get(2);
      Integer resPennies = resFull.get(3);

      model.put("importInput", importInput);
      model.put("resQuarters", resQuarters);
      model.put("resDimes", resDimes);
      model.put("resNickels", resNickels);
      model.put("resPennies", resPennies);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

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
    }
    while (cent >= 10) {
      Integer numDimes = cent/10;
      cent = cent%10;
      newArrayList.set(1,numDimes);
    }
    while (cent >= 5) {
      Integer numNickels = cent/5;
      cent = cent%5;
      newArrayList.set(2,numNickels);
    }
    if (cent >= 0) {
      if (cent >=1){
      Integer numPennies = cent/1;
      newArrayList.set(3,numPennies);
    } else {newArrayList.set(3,0);}
    }

    return newArrayList;
  }
}
