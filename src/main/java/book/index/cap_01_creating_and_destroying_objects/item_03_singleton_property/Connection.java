package book.index.cap_01_creating_and_destroying_objects.item_03_singleton_property;

public class Connection {
  private static final Connection INSTANCE = new Connection();

  private Connection() {
  }

  public static Connection getInstance() {
    return INSTANCE;
  }
}
