import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class EjecutorEmprendimiento {
    public static Emprendimiento emprendimientoX = new Emprendimiento("Victor", "Local Don Victor", 1291234567, "Loja", "Tecnologia", LocalDate.of(2004, 10, 21), 500);
    public static void main(String[] args) {
        Scanner tcl= new Scanner (System.in);
        int x;
        emprendimientoX.calcularAntiguedad();
        emprendimientoX.calcularClasificacion();
        System.out.println(emprendimientoX.toString());
        System.out.println("1.)Cambiar la ubicacion del local comercial \n2.)Añadir capital");
        x = tcl.nextInt();
        if (x == 1) {
            System.out.println("Ingrese la nueva ubicacion: ");
            emprendimientoX.setUbicacion(tcl.next());
            System.out.println(emprendimientoX.toString());
        }else if (x == 2) {
            System.out.println("Ingrese la cantidad a añadir: ");
            emprendimientoX.setCapital(tcl.nextDouble());
            System.out.println(emprendimientoX.toString());
        }else
            System.out.println("Opcion equivocada");
    }
}
class Emprendimiento{
    public String propietario;
    public String nombreComercial;
    public int RUC;
    public String ubicacion;
    public String sector;
    public LocalDate fechaInicio;
    public double capitalInicial;
    public double capital;
    public double antiguedad;
    public String clasificacion;
    public Emprendimiento(String propietario,String nombreComercial,int RUC,String ubicacion,String sector,LocalDate fechaInicio,double capitalInicial){
        this.nombreComercial = nombreComercial;
        this.propietario = propietario;
        this.RUC = RUC;
        this.ubicacion = ubicacion;
        this.sector = sector;
        this.fechaInicio = fechaInicio;
        this.capitalInicial = capitalInicial;
        this.capital = capitalInicial;
    }
    public void setCapital(double capital){
        this.capital += capital;
    }
    public double getCapital (){
        return this.capital;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public String getUbicacion (){
        return this.ubicacion;
    }
    public void calcularAntiguedad(){
        this.antiguedad = ChronoUnit.DAYS.between(this.fechaInicio, LocalDate.now());
        this.antiguedad /= 364;
    }
    public void calcularClasificacion (){
        if (this.capital > 50000) {
            this.clasificacion = "Mediano negocio";
        }else if (this.capital > 10000) {
            this.clasificacion = "Pequeño negocio";
        }else
            this.clasificacion = "Micro negocio";
    }
    public String toString(){
        return "Propietario: " + this.propietario + "\nNombre del comercial: " + this.nombreComercial + "\nRUC: " + this.RUC + "\nUbicacion: " + this.ubicacion + "\nSector: " + this.sector + "\nFecha de inicio: " + this.fechaInicio + "\nCapital inicial:" + this.capitalInicial + "\nCapital: " + this.capital + "\nAntiguedad en años: " + this.antiguedad + "\nClasificacion: " + this.clasificacion + "\n";
    }
}
