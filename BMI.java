class Man {
    private String name;
    private int age;
    private float weight;
    private float height;
    public Man() {
    }
    public Man(String name,int age,float weight,float height) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
        this.setHeight(height);
    }
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setWeight(float w) {
        weight = w;
    }
    public void setHeight(float h) {
        height = h;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public float getWeight() {
        return weight;
    }
    public float getHeight() {
        return  height;
    }
    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }
}

public class BMI {
    public static void main(String args[]) {
        
        Man stu = new Man("zhang",19,63.4f,1.752f);
        System.out.println("name is "+stu.getName());
        System.out.println("Age is "+stu.getAge());
        System.out.println("weight is "+stu.getWeight());
        System.out.println("height is "+stu.getHeight());
        System.out.println("BMI is "+stu.bmi());
    }
    
}
