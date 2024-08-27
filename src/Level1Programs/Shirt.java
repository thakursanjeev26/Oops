package Level1Programs;

public class Shirt {

    String size,colour;
    double price;

    public Shirt(String size,String colour,double price){
        this.size=size;
        this.colour=colour;
        this.price=price;
    }
    double discountPrice(){
        double discount=0;

        if(size.equals("small")){
            discount=price*0.5;
        } else if (size.equals("medium")) {
            discount=price*0.3;
        } else if (size.equals("large")) {
            discount=price*0.1;
        }
        return discount;
    }

    void display(){
        System.out.println("Size Of Shirt:"+size);
        System.out.println("Colour:"+colour);
        System.out.println("Price:"+price);
        System.out.println("DiscountPrice"+discountPrice());
    }


    public static void main(String[] args) {
        Shirt s = new Shirt("small","yellow",5000);
        s.discountPrice();
        s.display();
    }

}
