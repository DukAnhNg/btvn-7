package entities;

public class Product {
    private int id;
    private String name;
    private String descrip;
    private int quantities;
    private double price;
    private String unit;

    public Product(int id, String name, String descrip, int quantities, double price, String unit) {
        this.id = id;
        this.name = name;
        this.descrip = descrip;
        this.quantities = quantities;
        this.price = price;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrib(String describ) {
        this.descrip = describ;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descrip='" + descrip + '\'' +
                ", quantities=" + quantities +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                '}';
    }
}
