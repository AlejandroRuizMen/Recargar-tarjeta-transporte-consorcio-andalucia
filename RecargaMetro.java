
package recargametro;
import java.util.Scanner;
public class RecargaMetro {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c,r,e;
    e = (int) 05;
    System.out.println("Dime cantida recargar:");
    c = sc.nextInt();
    r = c / e;
    r = r * 1000;
    System.out.println("");
    System.out.println(r);
    System.out.println("");
    float ca,re,es;
    es = (float) 0.5;
    System.out.println("Dime numero entero:");
    ca = sc.nextInt();
    re = ca * es;
    re = re / 100;
    System.out.println("");
    System.out.println("Cantidad en tarjeta:" + re + "€");
    
   
    
    }
    
}
