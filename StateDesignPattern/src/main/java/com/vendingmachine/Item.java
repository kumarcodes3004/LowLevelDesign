package com.vendingmachine;


public class Item {

    ItemType type;
    private int price;

    public ItemType getType(){
        return type;
    }

    public void setType(ItemType type){
        this.type=type;
    }

    public void setPrice(int price){
        this.price=price;

    }

    public int getPrice(){
        return price;
    }


    @Override
    public String toString() {
        return "Item{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }


}
