package book.index.cap_01_creating_and_destroying_objects.item_03_singleton_property;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
  public static void main(String[] args) {
    var conn = Connection.getInstance();
    log.info("getting conn instance: {}", conn.toString());
  }
}
