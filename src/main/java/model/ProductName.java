package model;

public class ProductName {
    private String name;
    private int yearOfPublish;
    private String price;

    public ProductName() {
    }

    public ProductName(String name, int yearOfPublish, String min) {
        this.name = name;
        this.yearOfPublish = yearOfPublish;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public String getMin() {
        return price;
    }

    public void setMin(String min) {
        this.price = min;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", min=" + price +
                '}';
    }
}
