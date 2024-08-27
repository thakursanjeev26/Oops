package Level1Programs;

public class Tv {
    String brand;
    int size;
    double price;


    public Tv(String brand,int size,double price){
        this.brand=brand;
        this.size=size;
        this.price=price;

    }
    double calculatePrice(){
        double discount=0;
        double Afd;
        if(size==32){
            discount=price*0.8;
        }
        else if(size==43){
            discount=price*0.8;
        }
        else if(size==55){
            discount=price*0.10;
        }
        else{
            discount=price*0.12;
            Afd=price-discount;
        }
        return discount;

    }
    double AfterDiscount(){
        double afterDiscount;
        afterDiscount=price-calculatePrice();
       return  afterDiscount;
    }

    void display(){
        System.out.println("Brand of The Tv is"+brand);
        System.out.println("Size of tv : "+size);
        System.out.println("Price of tv is:"+price);
        System.out.println("Discount Amount :"+calculatePrice());
        System.out.println("After discount "+AfterDiscount());
    }

    public static void main(String[] args) {
        Tv t = new Tv("Samsung",62,99000);
        t.calculatePrice();
        t.display();
        t.AfterDiscount();
    }
}
