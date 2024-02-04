package JavaOOP02.company;

import JavaOOP02.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person=new Person("Hò", true,"Hà Nội", "083262428",23);
        person.showInfo();
        //set mới dữ liệu
        person.age=20;
          person.gender=false;
        person.name="Hòa";
        person.showInfo();


    }
}
