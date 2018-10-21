  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow Ameican", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Danish Blue Cheese" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( c ) ;
        
  
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        

        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
    
        Premiumtoppings f = new Premiumtoppings( "Premium Topping Options" );
        String[] fo = { "Marinated Tomatoes" } ;
        f.setOptions( fo ) ;
        f.wrapDecorator( t ) ;
        
        Bun m = new Bun("Bun Options");
        String[] mo = { "Ciabatta" };
        m.setOptions( mo ) ;
        m.wrapDecorator( f ) ;
        
        Side e = new Side( "Side Options" );
        String[] eo = { "Shoestring Fries" };
        e.setOptions( eo ) ;
        e.wrapDecorator( m ) ;
        
        
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( f ) ;
        customBurger.addChild( m ) ;
        customBurger.addChild( e ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/