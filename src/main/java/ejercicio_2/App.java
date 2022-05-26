package ejercicio_2;

import java.util.Scanner;

public class App {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        crearTabla(recogeDato());
    }

    public static int recogeDato(){
        System.out.println("-Creacion tabla multiplicar-");
        System.out.println("Introduce numero");
        int num_user=sc.nextInt();
        return num_user;
    }

    public static void crearTabla(int num_user){
        int result;
        for (int i = 0; i <= 10; i++) {
            result=num_user*i;
            System.out.println(num_user+"x"+i+"="+result);
        }
    }

}
