//comprimir una cadena de Strings, Ej: aaabb//3a2b y viceversa
import java.util.Scanner;
public class Ejercicio1 
{
    public static void main(String[] args) 
    {
     Scanner scan= new Scanner(System.in);
     System.out.println("Introduzca la cadena de caracteres");
     String cadena=scan.nextLine();
     System.out.println("La cadena comprimida es: " + comprimir(cadena));
     System.out.println("La cadena descomprimida es:" + descomprimir(comprimir(cadena)));
     
    }
    public static String  comprimir(String c)
     {
      String cp="";
      char indice_cadena=c.charAt(0);      
      int cont=0;
      String numero="";
      for(int i=0;i<=c.length()-1;i++)
       {
        if(c.charAt(i)==indice_cadena)
         {
          cont++;
         }
        else if(c.charAt(i)!=indice_cadena)
         {
          numero=Integer.toString(cont);
          cp=cp+numero+indice_cadena;
          indice_cadena=c.charAt(i);
          cont=1;
         }
        if(i==c.length()-1)
         {
          numero=Integer.toString(cont);
          cp=cp+numero+indice_cadena;
         }
        
       }
      return cp;
     }
    public static String  descomprimir(String c)
     {
      String cp="";
      for(int i=0;i<=c.length()-2;i++)
       {
        int repeticiones=Integer.parseInt("" + c.charAt(i));
        if(i==c.length()-2)
         {
          while(repeticiones!=0)
           {
            cp=cp+c.charAt(i+1);
            repeticiones--;
           }
          break;
         }
        else
         {
          while(repeticiones!=0)
           {
            cp=cp+c.charAt(i+1);
            repeticiones--;
           }
         }
        i++;
       }
      return cp;
     }
 
 }
