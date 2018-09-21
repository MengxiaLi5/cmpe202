
public class GumballMachine
{

    private int num_gumballs_1;
    private int num_gumballs_2;
    private int num_gumballs_3;
    private boolean has_quarter;
    private int count_quarter;


    public GumballMachine(int catecory,int size){
        if(catecory == 1){
            this.num_gumballs_1 = size;
        }
        if(catecory == 2){
            this.num_gumballs_2 = size;
        }
        if(catecory == 3){
            this.num_gumballs_3 = size;
        }
        this.has_quarter = false;

    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else
            this.has_quarter = false ;
    }



    public void insertQuarter2(int coin){
        while(coin/50!=0 && coin%50==0){
            count_quarter+=2;
            coin = coin-50;
            this.has_quarter = true;
        }

    }

    public void insertQuarter3(int coin){
        if(coin<50){
            count_quarter = 0;
        }
        else {
            count_quarter = coin/50;
            has_quarter = true;
        }

    }



    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs_1 > 0 )
            {
                this.num_gumballs_1-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!"+"剩余球数"+num_gumballs_1 ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert a quarter" ) ;
        }
    }


    public void turnCrank2(){
        if(this.num_gumballs_2>1) {
            while (this.count_quarter > 1 && num_gumballs_2 > 1) {
                if (this.has_quarter) {
                    if (this.num_gumballs_2 > 1) {
                        this.num_gumballs_2 -= 2;
                        count_quarter -= 2;
                        System.out.println("Thanks for your quarter.  Gumball Ejected!");

                    } else {
                        System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
                    }
                } else {
                    System.out.println("Please insert a quarter");
                }
            }
        }
        else {
            System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
        }
    }

    public void turnCrank3(){
        if(count_quarter==0){
            System.out.println("Please insert at least 50 cents");
            return;
        }
        if(this.num_gumballs_3>1) {
            while (this.count_quarter >= 1 && num_gumballs_3 >= 1) {
                if (this.has_quarter) {
                    if (this.num_gumballs_3 > 0) {
                        this.num_gumballs_3 -= 1;
                        count_quarter -= 1;
                        System.out.println("Thanks for your quarter.  Gumball Ejected!" + "还剩球的个数" + num_gumballs_3);

                    } else {
                        System.out.println("No More Gumballs!  Sorry, can't return your coins.");
                    }
                } else {
                    System.out.println("Please insert at least 50 cents");
                }
            }
        }
        else {
            System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
        }
    }
}
