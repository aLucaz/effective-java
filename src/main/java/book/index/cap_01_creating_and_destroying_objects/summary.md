# Table of Contents
- [Creating and Destroying Object](#creating-and-destroying-object)
  - [Items](#items)
    - [Item 1: Static factory methods instead of constructors](#item-01--static-factory-methods-instead-of-constructors)

---

## Creating and Destroying Object

- when and how to create objects
- when and how to avoid creating object
- ensure object destruction

### Items

#### Item 01: Static factory methods instead of constructors
- When to use it ? 
  - we have more than one constructor
  - we want to differentiate the objects of the same class since its creation
- Why to use it ?
  - it's a **BAD IDEA** to create multiple constructors with differents parametes
- Advantages
  - not need to create an object every time it's called
  - can improve performance if equivalent objects are requested often
  - can return same object from repeated invocations
  - classes with that characteristics are called Instance-Controlled
  - the class of the returned object can vary from call to call, bacause this patthern can be used in an interface
- Disadvantages
  - classes without public constructors cannot be subclassed
  - difficult to find
- Examples
  - from &rarr; Date.from(string)
  - of &rarr; EnumSet.of(a, b, c)
  - valueOf &rarr; BigInteger.valueOf(Integer.MAX_VALUE)
  - getInstance
  - newInstance &rarr; Array.newInstance(classObject, len)
  - getType  &rarr; Files.getFileStore(path)
  - type

#### Item 02: Builder instead of constructors

- When to use it ?
  - when you have too many parameters so static method factory not scale
  - when you want your class to be inmutable
  - when you want to clarify the sintax
- Why to use it ?
  - the JavaBean pattern that uses an empty constructor and a lot of setters can break the inmmutability
- Advantages
  - clear, concise
  - the object result is inmutable
- Disadvantages
  - 
- Examples
  - in code

