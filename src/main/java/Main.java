import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Setup
        Scanner sc = new Scanner(System.in);
        
        //Leitura do Início
        sc.next(); // Lê a palavra "Dia"
        int diaInicio = sc.nextInt();
        int horaInicio = sc.nextInt();
        sc.next(); // Lê o separador ":"
        int minInicio = sc.nextInt();
        sc.next(); // Lê o separador ":"
        int segInicio = sc.nextInt();

        //Leitura do Fim
        sc.next(); // Lê a palavra "Dia"
        int diaFim = sc.nextInt();
        int horaFim = sc.nextInt();
        sc.next(); // Lê o separador ":"
        int minFim = sc.nextInt();
        sc.next(); // Lê o separador ":"
        int segFim = sc.nextInt();
        
        long inicioEmSegundos = (diaInicio * 86400L) + (horaInicio * 3600L) + (minInicio * 60L) + segInicio;
        long fimEmSegundos = (diaFim * 86400L) + (horaFim * 3600L) + (minFim * 60L) + segFim;

        long duracaoTotal = fimEmSegundos - inicioEmSegundos;
        
        long dias = duracaoTotal / 86400;
        duracaoTotal %= 86400;

        long horas = duracaoTotal / 3600;
        duracaoTotal %= 3600;

        long minutos = duracaoTotal / 60;
        long segundos = duracaoTotal % 60;

        //Output
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();
    }
}