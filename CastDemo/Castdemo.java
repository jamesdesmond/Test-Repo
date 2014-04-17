class CastDemo
{
    public static void main(String[] Args)
    {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y); //truncation will occur here
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i; //byte can hold 100
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; //byte cannot hold 257
        System.out.println("Value of b: " + B);

        b = 88; //ASCII code for X
        ch = (char) b;  //the byte gets converted to char value
        System.out.println("ch: " + ch);
    }
}
