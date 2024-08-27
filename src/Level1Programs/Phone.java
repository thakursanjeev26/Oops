package Level1Programs;

public class Phone {
    String make,model;
    int storage;
    public Phone(String make,String model,int storage){
        this.make=make;
        this.model=model;
        this.storage=storage;
    }
    int calculatePhonePrice(){
        int price;
        if(storage==64){
            price=690000;
        }else if(storage==128){
            price=74000;
        }else if(storage==256){
            price=84000;
        }else{
            price=99000;
        }
        return price;
    }
    void Display(){
        System.out.println("Mobile is Manufactured By: "+make);
        System.out.println("Model of Mobile is: "+model);
        System.out.println("Storage of Mobile is: "+storage+" GB");
        System.out.println("Price of Mobile is "+calculatePhonePrice()+" Rs");
    }

    public static void main(String[] args) {
        Phone p = new Phone("Iphone","Iphone 12",512);
        p.calculatePhonePrice();
        p.Display();
    }
}
