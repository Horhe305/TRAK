import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Scanner Obj = new Scanner(System.in); 
    System.out.println("Witaj! Co chcesz zrobić?\n");
    System.out.println("1: Wyswietl liczby parzyste od 0 do 100");
    System.out.println("2: Sprawdz czy liczba jest pierwsza");


  int liczba = input.nextInt();
  switch (liczba)
  {
    case 1:
     for (int i=0; i<=100; i++)
       {
         if (i%2==0) System.out.println(i);
       }
    break;
      
    case 2:
     String s;
    System.out.println("Wpisz tekst: ");
    s = Obj.nextLine();
    char[] tekst = s.toCharArray();
    char tab[] = new char[100];

    for (int i = 0; i < tekst.length; i++)
      {
        if (tekst[i] == 32) tekst[i] = 95;
        tab[i] = tekst[i];
        System.out.print(tab[i]);
      }
 break; 
      
    default:
      System.out.println("Spróbuj raz jeszcze"); 
  }
  }
}