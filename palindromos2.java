//Extraer la mayor subcadena palindroma de una cadena de caracteres





import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) 
    {
      System.out.println("introduzca su cadena de caracteres");
      Scanner scan=new Scanner(System.in);
      String cadena=scan.nextLine();
      System.out.println("la mayor subcadena palindroma es : "+ palindroma(cadena));
    }
    public static String palindroma(String c)
    {
      int indice=0;
      char letra_1=c.charAt(indice);
      String cadena1="";
      String cadena2="";
      String palindroma="";
      while (indice!=c.length()-1) 
      {
        for(int i=c.length()-1;i>=indice;i--)
        {
          if(c.charAt(i)==letra_1)
          {
            cadena1=c.substring(indice, i+1);
            for(int j=cadena1.length()-1;j>=0;j--)
            {
              cadena2+=cadena1.charAt(j);
            }
            if(cadena1.length()>palindroma.length() && cadena2.equals(cadena1))
            {
              palindroma=cadena1;
              cadena2="";
            }
            else
            {
              cadena2="";
            }
          }
        }
        indice++;
        letra_1=c.charAt(indice);
      }
      return palindroma;
    }
}