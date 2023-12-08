package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isPaperBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price=300;
            this.extraToppingsPrice=70;
        }
        else
        {
            this.price=400;
            this.extraToppingsPrice=120;
        }
        this.extraCheesePrice=80;
        this.paperBagPrice=20;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isPaperBagAdded=false;
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded)
        {
            this.price+=extraCheesePrice;
            this.bill+="Extra Cheese Added: "+this.extraCheesePrice+"\n";
            this.isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded)
        {
            this.price+=extraToppingsPrice;
            this.bill+="Extra Toppings Added: "+this.extraToppingsPrice+"\n";
            this.isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded)
        {
            this.price+=paperBagPrice;
            this.bill+="Paperbag Added: "+this.paperBagPrice+"\n";
            this.isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
