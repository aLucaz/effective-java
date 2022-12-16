package book.index.cap_01_creating_and_destroying_objects.item_02_builder_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {

    NutritionInfo obj = new NutritionInfo.Builder(146, 12)
      .calories(1)
      .fat(12)
      .build();
    
    log.info(obj.toString());
  }
}
