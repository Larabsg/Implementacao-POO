import java.sql.Date;

public class UsedProduct extends Product{

    private String manufactureDate;

    public UsedProduct(String name, double price, String manufacturDate) {
        super(name, price);
        this.manufactureDate = manufacturDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + " (used) $ " + super.getPrice() + " (Manufacture date: " + manufactureDate + ")";
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }    
}
