import java.util.Scanner;

public class EjecutorInstitucionEducativa {
    public static void main(String[] args) {
        InstitucionEducativa institucion = new InstitucionEducativa();
        
        institucion.leerDato();
        
        institucion.calcularPresupuesto();
        
        System.out.println(institucion.toString());
    }
}

class InstitucionEducativa {
    public String nombre;
    public String tipoInstitucion;
    public int numeroAlumno;
    public int numeroDocente;
    public int numeroSede;
    public double gastoProyectado;
    public double presupuesto;

    public Scanner tcl;

    public InstitucionEducativa() {
        this.tcl = new Scanner(System.in);
    }
     public InstitucionEducativa(String nombre, String tipoInstitucion, int numeroAlumno, 
                                int numeroDocente, int numeroSede, double gastoProyectado) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumno = numeroAlumno;
        this.numeroDocente = numeroDocente;
        this.numeroSede = numeroSede;
        this.gastoProyectado = gastoProyectado;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public void setNumeroAlumno(int numeroAlumnos) {
        this.numeroAlumno = numeroAlumnos;
    }

    public void setNumeroDocente(int numeroDocentes) {
        this.numeroDocente = numeroDocentes;
    }

    public void setNumeroSede(int numeroSedes) {
        this.numeroSede = numeroSedes;
    }

    public void setGastoProyectado(double gastosProyectados) {
        this.gastoProyectado = gastosProyectados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public int getNumeroAlumno() {
        return numeroAlumno;
    }

    public int getNumeroDocente() {
        return numeroDocente;
    }

    public int getNumeroSede() {
        return numeroSede;
    }

    public double getGastoProyectado() {
        return gastoProyectado;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void leerDato() {
        System.out.print("Ingrese el nombre de la institucion: ");
        setNombre(tcl.nextLine());

        System.out.print("Ingrese el tipo de institucion: ");
        setTipoInstitucion(tcl.nextLine());

        System.out.print("Ingrese el numero de alumnos: ");
        setNumeroAlumno(tcl.nextInt());

        System.out.print("Ingrese el numero de docentes: ");
        setNumeroDocente(tcl.nextInt());

        System.out.print("Ingrese el numero de sedes: ");
        setNumeroSede(tcl.nextInt());

        System.out.print("Ingrese el gasto proyectado por estudiante: ");
        setGastoProyectado(tcl.nextDouble());
    }

    public void calcularPresupuesto() {
        this.presupuesto = this.numeroAlumno * this.gastoProyectado;
    }

    @Override
    public String toString() {
        return "Institucion Educativa: " + getNombre() + "\n" +
               "Tipo: " + getTipoInstitucion() + "\n" +
               "Numero de Alumnos: " + getNumeroAlumno() + "\n" +
               "Numero de Docentes: " + getNumeroDocente() + "\n" +
               "Numero de Sedes: " + getNumeroSede() + "\n" +
               "Gasto Proyectado por Estudiante: " + getGastoProyectado() + "\n" +
               "Presupuesto: " + getPresupuesto();
    }
}
