import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę 1:");
    int a=scanner.nextInt();
    System.out.println("Podaj liczbę 2:");
    int b=scanner.nextInt();
    System.out.println("Podaj liczbę 3:");
    int c=scanner.nextInt();

      if (a>b && a>c){
        System.out.println("Największa liczba to: "+a);
      }
      else if (b>a && b>c){
        System.out.println("Największa liczba to: "+b);
      }
      else if (c>a && c>b){
        System.out.println("Największa liczba to: "+c);
      }
      else{
        System.out.println("Nie ma największej liczby");
      }
    
    //System.out.println("Hello world!");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}