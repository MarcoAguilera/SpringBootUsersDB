package com.example.springbootmongodbexample.cart;

public class CartItem {
    private String Id;
    private int quantity;


    public CartItem(String Id, int quantity) {
        this.Id = Id;
        this.quantity = quantity;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}