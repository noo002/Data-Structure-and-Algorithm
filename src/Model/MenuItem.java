package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wei Kit
 */
public class MenuItem {
     double price;
    String status,promoInfo,menuName,category,description,resName;
    int menuCode;
    
    
    public MenuItem(String menuName,double price,String category,String description,String resName){
        this.menuName = menuName;
        this.price=price;
        this.category=category;
        this.description=description;
        this.resName = resName;
        
    }
    public MenuItem(){
        
    }


    public double getPrice() {
        return price;
    }

    public String getPromoInfo() {
        return promoInfo;
    }

    public String getStatus() {
        return status;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getResName() {
        return resName;
    }
    

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPromoInfo(String promoInfo) {
        this.promoInfo = promoInfo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }
    
}
