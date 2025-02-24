package ejercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
            String menu = "1";
            Set<Integer> valor1 = new HashSet<>();
            Set<Integer> valor2 = new HashSet<>();
                do{
                    System.out.print("ingresa numero 1 = ");
                    int num1 = sc.nextInt();
                    System.out.print("Ingresa numero 2 = ");
                    int num2 = sc.nextInt();
                    valor1.add(num1);
                    valor2.add(num2);

                    valor1.addAll(valor2);
                   
                    for (int valor : valor1) {
                        System.out.println(valor + valor);
                    }
                    
                }while(!menu.equals("2"));
            }catch (Exception e) {
            System.out.println("error por favor vuelve a ejecutrar el programa");
        }
    }
}