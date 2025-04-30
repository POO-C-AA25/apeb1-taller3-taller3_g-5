<<<<<<< HEAD
public class EjecutorEstudiante {
    public static Estudiante estudianteX = new Estudiante("Erick", 7.4, 8.2, 9.6);
    public static void main(String[] args) {
        estudianteX.estado();
        System.out.println(estudianteX.toString());
    }
}
class Estudiante {
    public String nombrEst;
    public double clase1;
    public double clase2;
    public double clase3;
    public double promedio;
    public String estado;
    public Estudiante (String nombrEst, double clase1, double clase2, double clase3){
        this.nombrEst = nombrEst;
        this.clase1 = clase1;
        this.clase2 = clase2;
        this.clase3 = clase3;
    }
    public void estado(){
        this.promedio = (this.clase1 + this.clase2 + this.clase3)/3;
        if (this.promedio >= 6.5) 
            this.estado = "Aprobado";
        else
            this.estado = "Reprobado";
    }
    public String toString(){
        return "Nombre: " + this.nombrEst + "\n Calificacion clase 1: " + this.clase1 + "\n Calificacion clase 2: " + this.clase2 + "\n Calificacion clase 3: " + this.clase3 + "\n Promedio: " + this.promedio + "\n Estado: " + this.estado; 
    }
}
=======
import java.util.Random;

public class EjecutorEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        
        estudiante.generarDatos();
        
        estudiante.calcularPromedio();
        
        estudiante.determinarEstado();
        
        System.out.println(estudiante.toString());
    }
}

class Estudiante {
    public String nombreEstudiante;
    public double calificacionMateria1;
    public double calificacionMateria2;
    public double calificacionMateria3;
    public double promedio;
    public String estado;
    
    Random random = new Random();
    
    public Estudiante() {}

    public void generarDatos() {
        this.nombreEstudiante = "Estudiante_" + (random.nextInt(1000) + 1);
        
       
        this.calificacionMateria1 = random.nextInt(11);  
        this.calificacionMateria2 = random.nextInt(11);  
        this.calificacionMateria3 = random.nextInt(11);  
    }

    public void calcularPromedio() {
        this.promedio = (this.calificacionMateria1 + this.calificacionMateria2 + this.calificacionMateria3) / 3.0;
    }

    public void determinarEstado() {
        if (this.promedio >= 6.5) {
            this.estado = "Aprobado";
        } else {
            this.estado = "Reprobado";
        }
    }

    public String toString() {
        return "Estudiante: " + this.nombreEstudiante + "\n" +
               "Materia 1: " + this.calificacionMateria1 + "\n" +
               "Materia 2: " + this.calificacionMateria2 + "\n" +
               "Materia 3: " + this.calificacionMateria3 + "\n" +
               "Promedio: " + this.promedio + "\n" +
               "Estado: " + this.estado;
    }
}
>>>>>>> 6cae8027fe75b22676819be29a6fc6b140961afc
