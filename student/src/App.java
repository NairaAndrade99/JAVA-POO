import java.util.Scanner;

import student.entites.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        Student student = new Student();

        student.notas = new double[3];

        System.out.println("Informe o seu nome: ");
        student.name = sc.nextLine();
         
        
        System.out.println("Informe as suas notas: ");
        for (int i = 0; i < student.notas.length ; i++){
           
             student.notas [i] = sc.nextInt();      
           
    }  
       

        System.out.println(student);
        
} 
}
