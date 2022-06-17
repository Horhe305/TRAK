import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Witaj! Co chcesz zrobić?\n");
    System.out.println("1: Sprawdź jak długi jest napis");

  int liczba = input.nextInt();
  switch (liczba)
  {
    case 1:
      String napis;
      int length;
      System.out.print("Podaj napis: ");
      napis = input.nextLine();
      length = napis.codePointCount(0,5);
      System.out.print("Napis ma "+length+" znaków");
    break;
    case 2:
      //System.out.println("Wybrales 2");
     break; 
    default:
      System.out.println("Spróbuj raz jeszcze");
  }
  }
}