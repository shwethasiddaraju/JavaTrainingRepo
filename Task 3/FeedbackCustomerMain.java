public class FeedbackCustomerMain {

    Feedback[] store = new Feedback[4];
    int feedbackIndex;

    void add(Feedback feedback) {
        store[feedbackIndex] = feedback;
        feedbackIndex++;
    }

    void feedbackDisplay() {
        for (int i = 0; i < store.length; i++) {
            System.out.println(store[i]);
        }
    }

    Customer[] register = new Customer[4];
    int customerIndex;

    void add(Customer customer) {
        register[customerIndex] = customer;
        customerIndex++;
    }

    void customerDisplay() {
        for (int i = 0; i < register.length; i++) {
            System.out.println(register[i]);
        }
    }

    Feedback fetchId(int id){
        for(int i=0; i< store.length; i++){
            if (store[i].customer.id == id){
                return store[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {

        FeedbackCustomerMain demo = new FeedbackCustomerMain();
        Customer customer1 = new Customer(1, "tom");
        demo.add(customer1);
        Customer customer2 = new Customer(2, "bob");
        demo.add(customer2);
        Customer customer3 = new Customer(3, "rob");
        demo.add(customer3);
        Customer customer4 = new Customer(4, "ram");
        demo.add(customer4);

        demo.customerDisplay();


        Feedback feedback1 = new Feedback(101, "good", customer1);
        demo.add(feedback1);
        Feedback feedback2 = new Feedback(201, "very good", customer2);
        demo.add(feedback2);
        Feedback feedback3 = new Feedback(301, "average", customer3);
        demo.add(feedback3);
        Feedback feedback4 = new Feedback(401, "satisfied", customer4);
        demo.add(feedback4);

        demo.feedbackDisplay();

        Feedback f1 = demo.fetchId(2);
        System.out.println("feedback by customer id: " + f1.description);
    }
}
