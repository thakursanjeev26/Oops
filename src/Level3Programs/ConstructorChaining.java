package Level3Programs;

public class ConstructorChaining {
int x ,y;

    public ConstructorChaining(){

        System.out.println("default Constructor");

    }

    public ConstructorChaining(int x){

        this.x=x;
        System.out.println(x);

    }


    public ConstructorChaining(int x, int y){

        this.x=x;
        this.y=y;
        System.out.println(this.x+this.y);
    }

    public static void main(String[] args) {
        ConstructorChaining ch = new ConstructorChaining(11);




    }
}
