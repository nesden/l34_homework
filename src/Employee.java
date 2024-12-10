public class Employee {

    String name;
    int yearOfJoining;
    int salary;
    Address address;

    public Employee(String name, int yearOfJoining, int salary, Address address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    public static class Address{
        String street;
        String addressNum;

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


    public static void print(Employee e1){

        System.out.printf("employee %s, %s %d %s-%s",e1.name,e1.name,e1.yearOfJoining,e1.address.addressNum,e1.address.street);
    }

    public static void main(String[] args) {
        Address address1=new Address("64c","wallsStreet");
        Employee robert=new Employee("robert",1994,20000,address1);
        print(robert);
        System.out.println("");
        Address address2=new Address("68d","wallsStreet");
        Employee sam=new Employee("sam",2000,20000,address2);
        print(sam);
        System.out.println("");
        Address address3=new Address("26b","wallsStreet");
        Employee john=new Employee("john",1999,20000,address1);
        print(john);
    }
}
