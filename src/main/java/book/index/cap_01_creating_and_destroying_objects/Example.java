package book.index.cap_01_creating_and_destroying_objects;

/*
 * Static Factory Methods
 * When to use it:
 *   - we have more than one constructor
 *   - we want to differentiate the objects of the same class since its creation
 * Why:
 *   - it's a BAD IDEA to create multiple constructors with differents parametes
 * Advantages
 *   - not need to create and object every time it's called
 *   - can improve performance if equivalent objects are requested often
 *   - can return same object from repeated invocations
 *   - classes with that characteristics are called Instance-Controlled
 *   - the class of the returned object can vary from call to call, bacause this patthern
 *       can be used in an interface
 * Disadvantages
 *   - classes without public constructors cannot be subclassed
 *   - difficult to find
 * Naming:
 *   - from -> Date.from(string)
 *   - of -> EnumSet.of(a, b, c)
 *   - valueOf -> BigInteger.valueOf(Integer.MAX_VALUE)
 *   - getInstance
 *   - newInstance -> Array.newInstance(classObject, len)
 *   - getType  -> Files.getFileStore(path)
 *   - type
 *
 * Example:
 *   Boolean.valueOf(true)
 * */

public class Example {
    private String title;
    private String description;

    private Example(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static Example from(String title, String description) {
        return new Example(title, description);
    }
}
