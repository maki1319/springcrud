package domain;

import java.io.Serializable;

public class account implements Serializable {
    private int ID;
    private String name;
    private double price;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "account{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
