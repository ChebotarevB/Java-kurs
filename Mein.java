import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   public static void main(String[] args) throws IOException { //"метод,который считывает информацию с консоли
        //"вывод информации "
        System.out.print("Укажите вносимую сумму");
        }
        //"создание объекта,который считываем инфорацию с консоли
        BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));
        String line=reader.readeLine(); //"нужно обработать исключение,которое требует обработать redLine
        double sum=Double.parseDouble(line); //"считали данные как строку; перевели строку в число и пол. в Double
        Sustem.out.println ("вывод информации о количестве лет,считывая с консоли,перевод строки в пер.типа int
        line= reader.readLine();
        int year=Integer.parseInt(line);

        Sustem.out.println("Укажите процентную ставку % в годовых);
        line=reader.readeLint();
        double percent=Double.parseDouble(line);

        //Вызывается метод calculate и результат его работы присваивается переменной income
        double income=calculate(sum,year,percent);

   1usage
   public static Double calculate(double sum,int year,double percent){
        double income=0;
        return income;
   }

