public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isOptedForTakeAway=false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;

        this.price+=extraCheesePrice;
    }
    public void addExtraTopping(){
        isExtraToppingAdded=true;

      this.price+=extraToppingPrice;
    }
    public void takeAway(){
        isOptedForTakeAway=true;

        this.price+=backPackPrice;
    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza : " + basePizzaPrice);
        if(isExtraCheeseAdded){
             bill += "Extra cheese added:" + extraCheesePrice + "\n";
        }
        if(isExtraToppingAdded){
            bill += "Extra topping added:" + extraToppingPrice + "\n";
        }
        if(isOptedForTakeAway){
            bill += "Take away Opted:" + backPackPrice + "\n";
        }
        bill +="Bill :" + this.price + "\n";
        System.out.println(bill);
    }
}
/**
 * Base pizza:300;
 * toppings:150;
 * cheese:100;
 * take away:20;
 */