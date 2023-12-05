import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        Random rd=new Random();

        String [] preguntas=new String [15];
        preguntas [0]="¿Cuanto es 2+2?";
        preguntas [1]="¿Cuantos lados tiene un cuadrado?";
        preguntas [2]="¿Cuantos lados tiene un triangulo?";
        preguntas [3]="¿Cuantas patas tiene un perro?";
        preguntas [4]="¿Cuantas ruedas tiene una bicicleta?";
        System.out.println("Bienvenido a nuestro juego de preguntas y respuestas");

    }
}
