
According to "GeeksforGeeks", "Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface). lambda expressions implement the only abstract function and therefore implement functional interfaces".

Java Lambda functionalities:
1) It enables to treat functionality as a method argument, or code as data.
2) A function that can be created without belonging to any class.
3) A lambda expression can be passed around as if it was an object and executed on demand.

In my original Strategy design pattern, I have three different operation strategy classes to implement different method:
  OperationAdd
  OperationMultiply
  OperationSubstract

However, lambda expressions implement all method in one class("Operations") in StrategyLambda: 
  public class Operations{
	  public Strategy add = (int num1, int num2) -> {return a + b ;};
	  public Strategy multiply = (int num1, int num2) -> {return a * b ;};
  	public Strategy substract = (int num1, int num2) -> {return a - b ;};
  }
  
In my opinion, the file will look a little bit clearer because all the operations are written in one class, instead of in different class file.
