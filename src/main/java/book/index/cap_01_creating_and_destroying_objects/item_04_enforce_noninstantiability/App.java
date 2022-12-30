package book.index.cap_01_creating_and_destroying_objects.item_04_enforce_noninstantiability;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    int result = Utility.doMultiplication();
    log.info(String.valueOf(result));
  }
}
