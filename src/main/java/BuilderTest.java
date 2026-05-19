public class BuilderTest {

    public static void main(String[] args) {
        Customer customer1 = new Customer.Builder()
                .withFirstName("Gideon")
                .withLastName("Bamuleseyo")
                .withAge(31)
                .withPhone("🖕🏿")
                .build();

        Customer customer2 = new Customer.Builder()
                .withFirstName("Manuela")
                .withLastName("Kunihira")
                .build();

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
