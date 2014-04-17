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


