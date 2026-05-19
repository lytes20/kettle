## Patterns Used
1. Singleton
2. Builder

## Builder Pattern
This pattern allows use create expressive code and immutable classes

## Singleton Pattern
This pattern allows you to only create one instance of a class.
A good example of a Singleton is the president of the United States. At any one given time, there can only be one president of the United States.

To create a singleton.
- Declare a private static instance of the class
- Make the constructor private
- Add a static method to get an instance of the singleton class

### Issues with a Singleton
- Reflection. You need to make it reflection safe
- If two threads create a singleton at almost the same time. You end up with two instances. You need to make a singleton thread safe
- With serialisation and deserialization, we might end up with 2 instances. Make the singleton serialization safe.

