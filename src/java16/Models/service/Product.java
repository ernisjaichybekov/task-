package java16.Models.service;

public class Product {

    private String id;
    private String category;
    private String name;
    private String parice;
    private String sizes;
    private String color;
    private String imageUry;
    private int quantity;


    public Product(String id, String category, String name, String parice, String sizes, String color, String imageUry, int quantity) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.parice = parice;
        this.sizes = sizes;
        this.color = color;
        this.imageUry = imageUry;
        this.quantity = quantity;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParice() {
        return parice;
    }

    public void setParice(String parice) {
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

    public String getImageUry() {
        return imageUry;
    }

    public void setImageUry(String imageUry) {
        this.imageUry = imageUry;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", parice='" + parice + '\'' +
                ", sizes='" + sizes + '\'' +
                ", color='" + color + '\'' +
                ", imageUry='" + imageUry + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

