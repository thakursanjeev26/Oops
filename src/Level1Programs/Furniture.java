package Level1Programs;

public class Furniture {
    String type,material;
    double price;


    public Furniture(String  type,String material,double price){
        this.type=type;
        this.material=material;
        this.price=price;
    }

    double discountPrice(){
        double discount=0;
        if(material.equals("Wood")){
            discount=price*0.5;
        }
        else if (material.equals("Metal")) {
            discount=price*0.3;

        } else if (material.equals("Plastic")) {
            discount=price*0.2;

        }else {
            discount=price*0.1;
        }

        return discount;
    }


    void display(){

        System.out.println("Type:"+type);
        System.out.println("Material:"+material);
        System.out.println("Price:"+price);
        System.out.println("Discounted_Price:"+discountPrice());

    }

    public static void main(String[] args) {
        Furniture  f = new Furniture("Chair","Wood",550);
        f.discountPrice();
        f.display();
    }
}
