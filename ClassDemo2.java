class Person {
    private String name;
    private int age;
    public void tell() {
        System.out.println("name is " + name + ",  age is " + age);
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        if (a>=0 && a <150) {
            age = a;
        }
    }
}


public class ClassDemo2 {
    public static void main(String args[]) {
        Person per = null;
        per = new Person();
        per.setName("zhang");
        per.setAge (-30);
        per.tell();
    }    
}
