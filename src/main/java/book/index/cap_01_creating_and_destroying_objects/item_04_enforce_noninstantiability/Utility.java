package book.index.cap_01_creating_and_destroying_objects.item_04_enforce_noninstantiability;

public class Utility {

  private Utility() {
    // this is not necessary
    throw new AssertionError();
  }

  public static int doMultiplication() {
    return 5 * 5;
  }
}
