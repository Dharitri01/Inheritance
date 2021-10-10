package dharitri;

public class Main {

    public static void main(String[] args) {
	//unary
        int a=4;
        a++;
        System.out.println("Increment: "+a);
        int b=3;
        b--;
        System.out.println("Decrement: "+b);
        boolean c=true;
        System.out.println("!c "+!c);
        //ternary
        double mark=48;
        if(mark>40)
        {
            System.out.println("Passed");
        }
        else{
            System.out.println("Fail");

        }

    }
}
