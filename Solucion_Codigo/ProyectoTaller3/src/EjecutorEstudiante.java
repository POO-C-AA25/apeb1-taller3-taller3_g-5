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