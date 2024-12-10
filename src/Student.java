public class Student {
    String name;
    int rollNo;
    String phoneNumber;
    //    String StreetName;
//    int addressNum;
    Address address;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student(String name, int rollNo, String phoneNumber, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNumber = phoneNumber;
//        StreetName = streetName;
//        this.addressNum = addressNum;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }


    static class Address {
        public String street;
        public String addressNum;

        public Address(String addressNum, String street) {

            this.addressNum = addressNum;
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", addressNum='" + addressNum + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Address address1 = new Address("36", "monkeys");
        Address address2 = new Address("24", "kaplan");



        Student sam = new Student("sam", 12, "058444", address1);
        Student john = new Student("John", 12, "058444", address2);
        System.out.println(sam);
        System.out.println(john);

    }
}

