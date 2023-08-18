package one;


public class MessageUtil {

   private String message;
   // source: https://www.tutorialspoint.com/junit/junit_time_test.htm
   //Constructor
   //Criar mensagem para demonstra-la
   public MessageUtil(String message){
      this.message = message; 
   }

   // Demonstrando a mensagem 
   public void printMessage(){
      System.out.println(message);
      while(true);
   }   

   // Customizando a mensagem
   public String salutationMessage(){
      message = "Olá voce está estudando" + message;
      System.out.println(message);
      return message;
   }   
}  	