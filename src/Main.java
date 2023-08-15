import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int operacion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu calculadora\nA continuacion selecciona la operacion que deseas realizar\n|  _________________  |\n" +
                "| | JO           0. | |\n" +
                "| |_________________| |\n" +
                "|  ___ ___ ___   ___  |\n" +
                "| | 7 | 8 | 9 | | + | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | 4 | 5 | 6 | | - | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | 1 | 2 | 3 | | x | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | . | 0 | = | | / | |\n" +
                "| |___|___|___| |___| |\n" +
                "|_____________________|");
        do {
        System.out.println("_________Menu__________\nSuma Ingresa (1)\nResta Ingresa (2)\nMultiplicacion Ingresa (3)\nDivision Ingresa (4)\nPotencia Ingresa (5)\nModulo Ingresa (6)\nSalir Ingresa (7)");
        operacion = sc.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Dame el primer numero para sumar ");
                int sum1 = sc.nextInt();
                System.out.println("Dame el segundo numero para sumar ");
                int sum2 = sc.nextInt();
                int ressum = sum1 + sum2;
                System.out.println("el resultado de tu suma es " + ressum);
                break;
            case 2:
                System.out.println("dame el primer numero para restar ");
                int res1 = sc.nextInt();
                System.out.println("dame el segundo numero para restar ");
                int res2 = sc.nextInt();
                int resres = res1 - res2;
                System.out.println("el resultado de tu resta es " + resres);
                break;
            case 3:
                System.out.println("dame el primer numero para multiplicar ");
                int mut1 = sc.nextInt();
                System.out.println("dame el segundo numero para multiplicar ");
                int mut2 = sc.nextInt();
                int resmut = mut1 * mut2;
                System.out.println("el resultado de tu multiplicacion es " + resmut);
                break;
            case 4:
                System.out.println("dame el primer numero para dividir ");
                int div1 = sc.nextInt();
                System.out.println("dame el segundo numero para dividir ");
                double div2 = sc.nextDouble();
                double resdiv = div1 / div2;
                System.out.println("el resultado de tu division es " + resdiv);
                break;
            case 5:
                System.out.println("Dame el numero que quieres elevar ");
                double pot1 = sc.nextInt();
                System.out.println("Dame el numero por el cual quieres elevar ");
                double pot2 = sc.nextInt();
                double respot = Math.pow(pot1, pot2);
                System.out.println("el resultado de tu numero elevad es " + respot);
                break;
            case 6:
                System.out.println("Dame un numero para sacar el modulo ");
                int mod1 = sc.nextInt();
                System.out.println("Dame un numero el cual dividir y sacar el modulo ");
                int mod2 = sc.nextInt();
                int resmod = mod1 %= mod2;
                System.out.println("el modulo de tu operacion es " + resmod);
                break;
            case 7:
                System.out.println("gracias por usar la calculadora:)");
                break;
            default:
                System.out.println("Numero Invalido");


        }
        }while (operacion!=7);


    }
}