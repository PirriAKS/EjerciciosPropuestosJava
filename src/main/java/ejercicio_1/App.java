package ejercicio_1;

import java.util.Scanner;

public class App {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        calcular(recogeDato());
    }
    public static int recogeDato(){
        System.out.println("-Calculo numero factorial-");
        System.out.println("Introduce numero");
        int num_user=sc.nextInt();
        return num_user;
    }
    public static void calcular(int num_user){
        int result=num_user;
        for (int i = num_user-1; i > 0; i--) {
            System.out.print(result+"x"+i+"=");
            result=result*i;
            System.out.println(result);
        }
        System.out.println("Factorial de "+num_user+"="+result);
    }
}
