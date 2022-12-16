package book.index.cap_01_creating_and_destroying_objects.item_01_static_factory_methods;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

  public static void main(String[] args) {
    var client01 = Client.getAnonymousInstance("abc-123");
    log.info(String.valueOf(client01));
    var client02 = Client.getNotIdentifiableInstance("999-999");
    log.info(String.valueOf(client02));
    var client03 = Client.getNotLegalInstance("xxx-xxx", "arturo", "992687327");
    log.info(String.valueOf(client03));
  }
}
