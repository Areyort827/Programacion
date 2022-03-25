
import java.util.Scanner;
 
public class Relacion2_8
{
    public static void main(String[] ARGS)
    {
        Scanner num = new Scanner(System.in);
        int mult,i,j;
 
        System.out.println("indica la tabla de multiplicar: ");
        mult = num.nextInt();
 
        for(i = mult; i<=mult; i++)
        {
            for(j = 1; j <= 10; j++)
            {
                System.out.println(i + " X " + j + " = " + i*j);
            }
        }
    }
}