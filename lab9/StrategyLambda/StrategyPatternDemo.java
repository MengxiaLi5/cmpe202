

public class StrategyPatternDemo {

   public static void main(String[] args) {

   	Operations operations = new Operations();

    Context context = new Context(operations.add);  
    System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
 
    context = new Context(operations.substract);      
    System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
 
    context = new Context(operations.multiply);    
    System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

   }

}