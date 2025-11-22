
/**
 * Write a description of class mathoperator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathoperator
{
    public static void main(String[] args)
    {
        int a=3;
       int b=9;
       System.out.println(a+b);
       System.out.println(b-a);
       System.out.println(a*b);
       System.out.println(b/a);
       
       int x=5;
       System.out.println(x++);
       System.out.println(++x);
       
       x +=8;
       System.out.println(+ x);
       
       
       int n=4;
        System.out.println(a==n);
        System.out.println(n!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        
        System.out.println((a>b)&&(a<b));
        System.out.println((a>b)||(a<b));
        //
        int max= (a>b)? a:b;
        System.out.println(max);
        }
}