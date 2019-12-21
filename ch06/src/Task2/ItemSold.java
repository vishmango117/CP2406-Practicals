package Task2;

// Class Itemsold
public class ItemSold {
    private int number;
    private String description;
    private float price;

    // Constructor with params
    public ItemSold(int number, String description, float price) {
        this.number = number;
        this.description = description;
        this.price = price;
    }

    //Getters and Setters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
