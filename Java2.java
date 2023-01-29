import java.rmi.MarshalledObject;

public class MOverloading {
void Display (int x)
{
    System.out.println("Display the integer Argument:"+x);

}
void Display (Float y)
{
    System.out.println("Display the Float Argument:"+y);

}
void Display (String s)
{
    System.out.println("Display the String/Character Arguments:"+s);

}

    public static void main(String[] args) {
        MOverloading MO=new MOverloading();
        MO.Display(8);MO.Display(57.3f);
        MO.Display(5.6f);MO.Display(67);
        MO.Display("yash");
        MO.Display("ugsugug");
    }
}
