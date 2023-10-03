public class Product {
    long id;
    double price;

    public Product(long id, double price) {
        this.id = id;
        this.price = price;
    }

    void increasePriceBy(double doubleAmount) {
        price = doubleAmount;
    }

}
