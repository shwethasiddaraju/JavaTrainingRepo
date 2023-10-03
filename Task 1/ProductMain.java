public class ProductMain {
    Product[] array = new Product[5];
    int index;
    void add(Product product) {
        array[index] = product;
        index++;
    }
    Void productDisplay() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("name of products id and the prices are :" + "  " + array[i].id + " and " + array[i].price);
        }
        return null;
    }

   Product findById(int id) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].id == id) {
                return array[i];
            }
        }
        return null;
    }


    public static void main(String[] args) {

        ProductMain demo = new ProductMain();

        Product product1 = new Product(1, 1000);
        demo.add(product1);
        Product product2 = new Product(2, 2000);
        demo.add(product2);
        Product product3 = new Product(3, 3000);
        demo.add(product3);
        Product product4 = new Product(4, 4000);
        demo.add(product4);
        Product product5 = new Product(5, 5000);
        demo.add(product5);

        demo.productDisplay();

        Product p1 = demo.findById(2);

        System.out.println("find product by id is: " + p1.price);


    }

}





