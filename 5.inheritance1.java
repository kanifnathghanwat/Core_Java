class Base
{
    int x=50;
}

class Child extends Base
{
    int x=20;
    void show()
    {
         System.out.println(x);
         System.out.println(super.x);
     }
}

public class InheritanceAbhiAndroid
{

    public static void main(String[] args)
    {
        Child c=new Child();
        c.show();
     }
}