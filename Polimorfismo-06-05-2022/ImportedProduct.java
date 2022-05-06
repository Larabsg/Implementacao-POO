public class ImportedProduct extends Product{
    
    private double customsFree;

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }    

    public double getCustomsFree() {
        return customsFree;
    }

    private Double calculaPrecoTarifado() {
        return super.getPrice() + customsFree;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFree = customsFree;
    }
    
    @Override
    public String priceTag() {
        return super.getName() + " $ " + calculaPrecoTarifado() + " (Customs fee: $ " + customsFree + ")";
    }
}
