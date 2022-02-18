import java.util.Scanner;
import java.util.regex.*;

class Main {

  public static void main(String[] args) {
    int a;
    Scanner s = new Scanner(System.in); //Coletando senha 

    String rd = "(?=.*\\d+).+$";          // rd é numero
    String ru = "(?=.*[A-Z]).+$";         // ru é maiusculo
    String rl = "(?=.*[a-z]).+$";         // rl é minusculo
    String rs = "(?=.*[-+_!@#$%^&*., ?]).+$";   // rs é especial

    String senha = s.next();
    if (senha.length()<6){   //conferindo se senha tem menos de 6 char
      a = 6-senha.length();
    }else
    {
      a = 0;                //declarando que tem mais de 6
    }
    int rq = 0;
    Pattern pd = Pattern.compile(rd);  //compilando regex em um padrao
    Matcher md = pd.matcher(senha);    
    if(!md.matches()) {                //conferindo se nao tem numero na senha 
      rq++;
    }
    
    Pattern pu = Pattern.compile(ru);  //compilando regex em um padrao
    Matcher mu = pu.matcher(senha);    
    if(!mu.matches()) {                //conferindo se nao tem maiuscula na senha
      rq++;
    }
    
    Pattern pl = Pattern.compile(rl);  //compilando regex em um padrao
    Matcher ml = pl.matcher(senha);    
    if(!ml.matches()) {                //conferindo se nao tem minuscula na senha
      rq++;
    }
    
    Pattern ps = Pattern.compile(rs);  //compilando regex em um padrao
    Matcher ms = ps.matcher(senha);    
    if(!ms.matches()) {                //conferindo se nao tem especial na senha
      rq++;
    }
    
    System.out.println(a>rq?a:rq);    //se tamanho da senha for maior que rq resposta = a se nao rq (que e o valor de erros)

  }
}