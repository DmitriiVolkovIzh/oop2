package Login_Password;

public class Test {
    public static void main (String[]args){
        boolean succes = Data.validate("log","test","test");
        if (succes){
            System.out.println("Данные введены вверно");}
        else{
            System.out.println("Данные введены не вверно");
        }
    }
}
