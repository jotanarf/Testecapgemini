import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int m,k;
    Scanner s = new Scanner(System.in); //coletando numero
    int n = s.nextInt();
    
    for (m = 1; m <= n; m++){      //contador para numero de linhas
      for ( k = 0; k <= n-m;k++){  //contador inverso para colocar espaço antes do *
        System.out.print(" ");     //printando espaço
      }
      for ( k = 0; k < m; k++){    //Contador para numero de * em cada linha
        System.out.print("*");     //Printando *
      }
      System.out.print("\n");
    } 
  }
}