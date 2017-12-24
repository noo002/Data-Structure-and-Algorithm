/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wee Kian Huat
 */
public class FoodMenu{
    private String foodID, foodName;
    private double price;

    public FoodMenu(){        
    }
    
    public FoodMenu(String foodID, String foodName, double price){ 
        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
    }
    
    public String getFoodName(){
        return foodName;
    }

    public double getPrice(){
        return price;
    }

    public String getFoodID(){
        return foodID;
    }
    
    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public String toString (){
        return getFoodID() + "\n" + getFoodName() + "\n" + getPrice() + "\n"; 
    }
    
 
}
