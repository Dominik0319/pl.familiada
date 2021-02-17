import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {  
System.out.println( "Witaj w grze familiada" );
Scanner scanner = new Scanner(System.in);  
String[][] dane = 
{
  {"Więcej niż jedno zwierzę to: ","stado","klucz","dwa","owca","lama"},
  {"Sporty na s to: ","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
};
  int wynik = 0;
for(int i = 0; i < dane.length; i++){
  System.out.println(dane[i][0]); 
  String odp = scanner.nextLine();
  boolean isAnswerCorrect = false;
for(int coś = 1; coś<dane[i].length; coś++){   
  if(dane[i][coś].equals(odp)){
  isAnswerCorrect = true;
  System.out.println( "BRZDĘK" );
  wynik += coś*10;
}
}
  if(!isAnswerCorrect){
  System.out.println("X");
}
}      
  System.out.println("Twój wynik to "+wynik);
  scanner.close();
}
}