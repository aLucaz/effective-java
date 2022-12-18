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
  - siempre se tiene que crear el builder para crear un objeto
  - puede llegar a ser un problema en apps de performance critico
- Examples
  - in code

#### Item 03: Enforce the singleton property

- When to use it ?
  - cuando se requiere hacer uso del patron singleton
- Advantages
  - se tienen varias formas recomendadas de aplicar el patron
    - public field
      - se hace mas evidente que la clase es singleton
    - static factory
      - mas flexible que el anterior
      - el comportamiento puede cambiar, crear un objeto cada vez que se llama al metodo
    - usar enum con un unico field
      - es la mejor forma de aplicar singleton, pero tiene limitantes 
      - no se puede usar en casos de herencia
- Notes
  - para hacer que una clase singleton sea serializable se tien que agregar 
    - un metodo readResolve
