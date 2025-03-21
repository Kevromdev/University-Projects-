//Crear una calculadora de numeros romanos 





import java.util.Scanner;
public class Ejercicio3 
{
  public static void main(String[] args) 
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Introduzca su primer numero"); 
    String numero1=scan.next();
    System.out.println("Introduzca su segundo numero");
    String numero2=scan.next();
    System.out.println("Que desea realizar con los numeros?");
    System.out.println("1-sumar");
    System.out.println("2-restar");
    System.out.println("3-multiplicar");
    System.out.println("4-dividir");
    System.out.println("5-terminar");
    int opcion=scan.nextInt();
    while(opcion!=5)
    {
      if(opcion>5)
      {
        System.out.println("Introduzca una opcion valida");
        System.out.println("Que desea realizar con los numeros?");
        System.out.println("1-sumar");
        System.out.println("2-restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("5-terminar");
        opcion=scan.nextInt();
      } 
      switch (opcion) 
      {
        case 1:
          System.out.print("El resultado es: ");
          int resultado=traducir(numero1)+traducir(numero2);
          System.out.println(convertir_romano(resultado));
          System.out.println("Que desea realizar con los numeros?");
          System.out.println("1-sumar");
          System.out.println("2-restar");
          System.out.println("3-multiplicar");
          System.out.println("4-dividir");
          System.out.println("5-terminar");
          opcion=scan.nextInt();
          break;
        case 2:
          System.out.print("El resultado es: ");
          int resultado2=traducir(numero1)+traducir(numero2);
          System.out.println(convertir_romano(resultado2));
          System.out.println("Que desea realizar con los numeros?");
          System.out.println("1-sumar");
          System.out.println("2-restar");
          System.out.println("3-multiplicar");
          System.out.println("4-dividir");
          System.out.println("5-terminar");
          opcion=scan.nextInt();
          break;
        case 3:
          System.out.print("El resultado es: ");
          int resultado3=traducir(numero1)+traducir(numero2);
          System.out.println(convertir_romano(resultado3));
          System.out.println("Que desea realizar con los numeros?");
          System.out.println("1-sumar");
          System.out.println("2-restar");
          System.out.println("3-multiplicar");
          System.out.println("4-dividir");
          System.out.println("5-terminar");
          opcion=scan.nextInt();
          break;
        case 4:
          System.out.print("El resultado es: ");
          int resultado4=traducir(numero1)+traducir(numero2);
          System.out.println(convertir_romano(resultado4));
          System.out.println("Que desea realizar con los numeros?");
          System.out.println("1-sumar");
          System.out.println("2-restar");
          System.out.println("3-multiplicar");
          System.out.println("4-dividir");
          System.out.println("5-terminar");
          opcion=scan.nextInt();
          break;
        default:
          break;
      }
    }
  }
  public static int traducir( String n)
  {
    int numero=0;
    int suma=0;
    if(n.length()==1)
    {
      switch (n) 
      {
        case "I":
          numero+=1;
          break;
        case "V":
          numero+=5;
          break;
        case "X":
          numero+=10;
          break;
        case "L":
          numero+=50;
          break;
        case "C":
          numero+=100;
          break;
        case "D":
          numero+=500;
          break;
        case "M":
          numero+=1000;
          break;
        default:
          break;
      }
    }
    else
    {
      for(int i=0;i<=n.length()-1;i++)
      {
        switch (n.charAt(i)) 
        {
          case 'I':
            suma=1;
            break;
          case 'V':
            suma=5;
            break;
          case 'X':
            suma=10;
            break;
          case 'L':
            suma=50;
            break;
          case 'C':
            suma=100;
            break;
          case 'D':
            suma=500;
            break;
          case 'M':
            suma=1000;
            break;
          default:
            break;
        }
        if(suma>numero)
        {
          numero=suma-numero;
        }
        else if (suma<=numero) 
        {
          numero=suma+numero;
        }
      }
    }
    return numero;
  }

  public static  String convertir_romano (int n)
  {
    String numero_romano="";
    int diccionario_romano []= new int[13];
    diccionario_romano[0]=1;
    diccionario_romano[1]=4;
    diccionario_romano[2]=5;
    diccionario_romano[3]=9;
    diccionario_romano[4]=10;
    diccionario_romano[5]=40;
    diccionario_romano[6]=50;
    diccionario_romano[7]=90;
    diccionario_romano[8]=100;
    diccionario_romano[9]=400;
    diccionario_romano[10]=500;
    diccionario_romano[11]=900;
    diccionario_romano[12]=1000;
    for(int i=12;i>=0;i--)
    {
      while (n>=diccionario_romano[i]) 
      {
        n-=diccionario_romano[i];
        switch (diccionario_romano[i]) 
        {
          case 1:
          numero_romano=numero_romano+"I";  
          break;
          case 4:
          numero_romano=numero_romano+"IV";  
          break;
          case 5:
          numero_romano=numero_romano+"V";
          case 9:
          numero_romano=numero_romano+"VIV";
          case 10:
          numero_romano=numero_romano+"X";  
          break;  
          case 40:
          numero_romano=numero_romano+"XL";  
          break;
          case 50:
          numero_romano=numero_romano+"L";
          break;
          case 90:
          numero_romano=numero_romano+"XC";
          break;
          case 100:
          numero_romano=numero_romano+"C";
          break;
          case 400:
          numero_romano=numero_romano+"CD";
          break;
          case 500:
          numero_romano=numero_romano+"D";
          break;
          case 900:
          numero_romano=numero_romano+"CM";
          break;
          case 1000:
          numero_romano=numero_romano+"M";
          break;
          default:
          break;
        }
      }
    }
    return numero_romano;
  }
}