package InClass;

class Student{
    String name, address;
    int phone, aadhar, parentphone;

    Student(String name, int phone, int aadhar) {
        this.name = name;
        this.phone = phone;
        this.aadhar = aadhar;
    }

    Student(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    Student(String name, String address, int phone, int aadhar) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.aadhar = aadhar;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + ", phone=" + phone + ", aadhar=" + aadhar
                + ", parentphone=" + parentphone + "]";
    }

    public static void main(String args[]) {
        Student s1 = new Student("a", 99, 123456);
        System.out.println(s1.toString());
    }
}
