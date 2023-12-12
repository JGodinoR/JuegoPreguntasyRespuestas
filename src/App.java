import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        Random rd=new Random();

        String [] preguntas=new String [15];
        String [] respuestas=new String [15];

        preguntas [0]="¿Cuanto es 2+2?";
        respuestas [0]="4";
        preguntas [1]="¿Cuantos lados tiene un cuadrado?";
        respuestas [1]="4";
        preguntas [2]="¿Cuantos lados tiene un triangulo?";
        respuestas [2]="3";
        preguntas [3]="¿Cuantas patas tiene un perro?";
        respuestas [3]="4";
        preguntas [4]="¿Cuantas ruedas tiene una bicicleta?";
        respuestas [4]="2";
        preguntas [5]="¿Cuantos ojos tiene una mosca?";
        respuestas [5]="2";
        preguntas [6]="¿Cual es la capital de España?";
        respuestas [6]="Madrid";
        preguntas [7]="¿Como se llaman los triangulos que tienen sus tres lados iguales?";
        respuestas [7]="Equilatero";
        preguntas [8]="¿Cuantos meses tiene un año?";
        respuestas [8]="12";
        preguntas [9]="¿Cuantos dias tiene una semana?";
        respuestas [9]="7";
        preguntas [10]="¿En que pais estamos?";
        respuestas [10]="España";
        preguntas [11]="¿Quien descubrió Ámerica?";
        respuestas [11]="Cristobal Colón";
        preguntas [12]="¿Cuantas ruedas tiene un coche?";
        respuestas [12]="4";
        preguntas [13]="¿Cuantos tentaculos tiene un pulpo?";
        respuestas [13]="8";
        preguntas [14]="¿Cuantas patas tiene un cangrejo?";
        respuestas [14]="6";
      
        System.out.println("Bienvenido a nuestro juego de preguntas y respuestas");
        System.out.println("Las preguntas cuyas respuestas sean números respondelas con una cifra, no por escrito");
        System.out.println("Ignore las tildes en las palabras aunque su respuesta la contenga");



    }
}
