public class EjecutorInstituciones {
    public static Instituciones_Educativas InstitucionX = new Instituciones_Educativas("Rosarista", "Fiscomisional", 5000, 500, 2, 240.50);
    public static void main(String[] args) {
        InstitucionX.presupuesto();
        System.out.println(InstitucionX.toString());
    }
}
class Instituciones_Educativas{
    public String nombre;
    public String tipo;
    public int numAlumnos;
    public int numDocentes;
    public int numSedes;
    public double gastosProyectaEst;
    public double presupuesto;
    public Instituciones_Educativas(String nombre, String tipo, int numAlumnos, int numDocentes, int numSedes, double gastosProyectaEst){
        this.nombre = nombre;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.tipo = tipo;
        this.gastosProyectaEst = gastosProyectaEst;
    }
    public void presupuesto(){
        this.presupuesto = this.numAlumnos * this.gastosProyectaEst;
    }
    public String toString(){
        return "Nombre: " + this.nombre + "\nTipo: " + this.tipo + "\nNumero de alumnos: " + this.numAlumnos + "\nNumero de docentes: " + this.numDocentes + "\nNumero de Sedes: " + this.numSedes + "\nGastos proyectados por estudiante: " + this.gastosProyectaEst + "$" + "\nPresupuesto: " + this.presupuesto + "$";
    }
}
