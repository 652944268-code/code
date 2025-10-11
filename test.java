package demo;

public class test {
    public static void main(String[] args) {
        

        Phone p1 = new Phone("huawei", 3999.0);
        
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());

        p1.call();
        p1.playgame();

        
    }    
}
