package book.index.cap_01_creating_and_destroying_objects.item_01_static_factory_methods;

import lombok.ToString;

@ToString
public class Client {
  private final String id;
  private final String name;
  private final String phone;
  private final String dni;

  private Client(String id) {
    this.id = id;
    this.name = "";
    this.phone = "";
    this.dni = "";
  }

  public static Client getAnonymousInstance(String id) {
    return new Client(id);
  }

  private Client(String id, String name) {
    this.id = id;
    this.name = name;
    this.phone = "";
    this.dni = "";
  }

  public static Client getNotIdentifiableInstance(String id) {
    return new Client(id, "NOT_IDENTIFIABLE");
  }

  private Client(String id, String name, String phone) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.dni = "";
  }

  public static Client getNotLegalInstance(String id, String name, String phone) {
    return new Client(id, name, phone);
  }

  public Client(String id, String name, String phone, String dni) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.dni = dni;
  }

}
