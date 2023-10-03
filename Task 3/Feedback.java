public class Feedback {
    int id;
    String description;
    Customer customer;

    public Feedback(int id, String description, Customer customer) {
        this.id = id;
        this.description = description;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", customer=" + customer +
                '}';
    }
}
