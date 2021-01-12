public class GameGuessLiter {
    public static void main(String args[]) throws java.io.IOException{
        char ch, ignor, answer;
        int ran, counter;
        counter=0;
        ran=(int)(Math.random()*26)+65;
        answer=(char)ran;
     //   System.out.println(answer);  //Вывести загаданную букву

        do{
            System.out.println("Угадай букву из диапазона A-Z! Введи свой вариант: ");
            counter++;
            ch=(char)System.in.read();
            do{
                ignor=(char)System.in.read();
            }while (ignor!='\n');
            if(ch==answer){
                System.out.println("Ты прав!");
            } else {
                if(ch>answer){
                    System.out.println("Загаданная буква ближе к началу алфавита");
                } else System.out.println("Загаданная буква ближе к концу алфавита");
            }
        }while (ch!=answer);
        System.out.println("Вы угадали с "+counter+" попытки!");
        System.out.println("* Конец програмы *");
    }
}
