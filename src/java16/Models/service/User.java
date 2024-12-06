package java16.Models.service;

import java.util.Objects;

public class User {

    private String id;
    private String email;
    private String password;
    private String name;
    private int parice;
    private String sizes;
    private String color;
    private String imageUrl;
    private int quantity;

    public User(String id, String email, String password, String name, int parice, String sizes, String color, String imageUrl, int quantity) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.parice = parice;
        this.sizes = sizes;
        this.color = color;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParice() {
        return parice;
    }

    public void setParice(int parice) {
        this.parice = parice;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", parice=" + parice +
                ", sizes='" + sizes + '\'' +
                ", color='" + color + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}