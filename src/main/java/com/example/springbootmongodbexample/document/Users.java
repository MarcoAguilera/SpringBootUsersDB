package com.example.springbootmongodbexample.document;

import java.util.ArrayList;
import java.util.List;

import com.example.springbootmongodbexample.cart.CartItem;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users{
    @Id
    private String id;

    private String username;
    private String password;
    private List<CartItem> cart;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
        cart = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return this.username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CartItem> getCart(){
        return cart;
    }

    public void addItem(CartItem item) {
        this.cart.add(item);
    }

}