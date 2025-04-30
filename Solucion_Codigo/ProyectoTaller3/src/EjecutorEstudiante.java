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
