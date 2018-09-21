
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(1,5);
        gumballMachine.insertQuarter( 10 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        
        GumballMachine gm2 = new GumballMachine(2,5);
        gm2.insertQuarter2(25);
        gm2.turnCrank2();
        gm2.insertQuarter2(50);
        gm2.turnCrank2();

        GumballMachine gm3 = new GumballMachine(3,5);
        gm3.insertQuarter3(10);
        gm3.turnCrank3();
        gm3.insertQuarter3(25);
        gm3.turnCrank3();
        gm3.insertQuarter3(5);
        gm3.turnCrank3();
        m3.insertQuarter3(10);
        gm3.turnCrank3();
    }
}