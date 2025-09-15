import java.util.Scanner;

public class tempos {

    double celcios;
    double kelvin;
    double Fahrenheit;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("quantos graus celcios estão?");
        celcios = leitor.nextDouble();
        calculoDeGraus();
    }

    public void calculoDeGraus(){
        kelvin = celcios + 273.15;


        Fahrenheit = (celcios * 1.8) + 32;

        exibirResultados();
    }

    public void exibirResultados(){

        System.out.println("a Temperatura, " +celcios+ " °C em Kelvin e em Fahrenheit são respectivamente: ");
        System.out.println("------------------------");
        System.out.println(" " +kelvin+ " K");
        System.out.println("-------------------------");
        System.out.println(" " +Fahrenheit+ " °F");
        System.out.println("-------------------------");
    }


}
