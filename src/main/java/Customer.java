public class Customer {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private int age;
    private int numberOfChildren;
    private int shoeSize;
    private boolean isMarried;
    private double yearlyIncome;
    private double yearlyAmountSpendOnShoes;

    public Customer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.email = builder.email;
        this.age = builder.age;
        this.numberOfChildren = builder.numberOfChildren;
        this.shoeSize = builder.shoeSize;
        this.isMarried = builder.isMarried;
        this.yearlyIncome = builder.yearlyIncome;
        this.yearlyAmountSpendOnShoes = builder.yearlyAmountSpendOnShoes;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", numberOfChildren=" + numberOfChildren +
                ", shoeSize=" + shoeSize +
                ", isMarried=" + isMarried +
                ", yearlyIncome=" + yearlyIncome +
                ", yearlyAmountSpendOnShoes=" + yearlyAmountSpendOnShoes +
                '}';
    }

    public static class Builder{
        private String firstName = "";
        private String lastName = "";
        private String phone = "";
        private String email = "";
        private int age = 0;
        private int numberOfChildren = 0;
        private int shoeSize = 0;
        private boolean isMarried = false;
        private double yearlyIncome = 0.0;
        private double yearlyAmountSpendOnShoes = 0.0;

        public Builder withFirstName(String firstName){
            this.firstName= firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withNumberOfChildren(int numberOfChildren) {
            this.numberOfChildren = numberOfChildren;
            return this;
        }

        public Builder withShoeSize(int shoeSize) {
            this.shoeSize = shoeSize;
            return this;
        }

        public Builder isMarried() {
            this.isMarried = true;
            return this;
        }

        public Builder withYearlyIncome(double yearlyIncome) {
            this.yearlyIncome = yearlyIncome;
            return this;
        }

        public Builder setYearlyAmountSpendOnShoes(double yearlyAmountSpendOnShoes) {
            this.yearlyAmountSpendOnShoes = yearlyAmountSpendOnShoes;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }

    }
}
