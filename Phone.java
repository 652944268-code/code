package demo;

public class Phone {
    private String name ;
    private Double price;

    public Phone() {
        name = "no";
        price = 0.0; 
    }
    public Phone(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(Double price){
        if(price >=1000 && price <100000) {
            this.price = price;
        }else {
            System.out.println("not allowed price");
        }
    }
    public Double getPrice(){
        return price;
    }

    public void call() {
        System.out.println("the phone is calling");
        name = "iphone";
        System.out.println("the phone name is " + name);
    }
    public void playgame() {
        System.out.println("the phone is playing game");
    }
}
