package ejercicio_3;

import java.util.Scanner;

public class App {
    static Scanner sc=new Scanner(System.in);
    static final String palabra_secreta="java";
    public static void main(String[] args) {
        comparar();
    }
    public static String recogeDato(){
        System.out.println("-Adivina la palabra secreta-");
        System.out.println("Introduce palabra");
        String palabra_user=sc.next();
        return palabra_user;
    }
    public static void comparar() {
        String valor;
        boolean flag=false;

        for (int i = 3; i >= 1; i--) {
            valor = recogeDato();

            if(valor.equals(palabra_secreta)){
                flag=true;
                i=0;
            }
            if(!flag){System.out.println("Numero de intentos: "+(i-1));}
        }
        if(!flag){System.out.println("***Perdiste***");}
        if(flag){System.out.println("***Ganaste***");}
    }
}
