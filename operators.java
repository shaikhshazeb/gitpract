/**
 * operators
 */
 class operators {

    public static void main(String[] args) 
    {
        //arithmatic operators
        int a=13;
        int b=6;
        System.out.println("Addition of a and b is " + " " +(a+b));
        System.out.println("substraction of a and b is " + " " +(a-b));
        System.out.println("Multiplication of a and b is " + " " +(a*b));
        System.out.println("Division of a and b is " + " " +(a/b));
        System.out.println("Modulus of a and b is " + " " +(a%b));


        //unary operaters

        
        System.out.println(a++);//13
        System.out.println(++a);//15
        System.out.println(a--);//15
        System.out.println(--a);//13

        //logical operators

        boolean ab=true;
        boolean bc=false;
        System.out.println("The value of ab && bc is "+(ab&&bc));
        System.out.println("The value of ab || bc is "+(ab||bc));
        System.out.println("The value of  !bc is "+(!bc));

       //Relational Operators
      
       int x=10;
       int z= 20;
       System.out.println(x>z);
       System.out.println(x<z);
       System.out.println(x==z);
       System.out.println(x!=z);
       System.out.println(x>=z);
       System.out.println(x<=z);

       //Assignement Operators

       int d=1;
        d+=3;
        d-=4;
        d*=5;
        d/=6;

       System.out.println(d);
       
       //Ternary Operators
       int num1= 10;
       int num2 = 20;
       int result=(num1>num2) ? num1:num2;
       System.out.println("The Largest Number is "  +result);

       //bitwise operators

       int n1=10;
       int n2=2;
       System.out.println("The value of n1 & n2 is "+(n1 & n2));
       System.out.println("The value of n1 | n2 is "+(n1 | n2));
       System.out.println("The value of  n1 ^ n2 is "+(n1 ^ n2));

        //shift operators
        System.err.println(n1<<n2);// n1 * 2 ^ 2
        System.err.println(n1>>n2); // n1 / 2 ^ 2


    }
}