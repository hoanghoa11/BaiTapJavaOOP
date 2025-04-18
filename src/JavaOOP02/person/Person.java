package JavaOOP02.person;

public class Person {
   public String name;
   public boolean gender;
   private String address, phone;
   public int age;

    public Person(String name, boolean gender, String address, String phone, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setGender(boolean gender) {
        if(gender){
            System.out.println("Giới tính nữ");
        }else {
            System.out.println("Giới tính nam");
        }

    }
    public void showInfoCompany(){
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+age);
        setGender(gender);


    }
    protected void showInfo(){
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+age);
        setGender(gender);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Số điện thoại: "+phone);

    }
}
