public class EjecutorAutomotor {
    public static Automotor automotorX = new Automotor(1105373193, "Toyota", 2013, 10000);
    public static void main(String[] args) {
        automotorX.calcularValorMatricula();
        System.out.println(automotorX.toString());
    }
}
class Automotor{
    public int cedulaDueño;
    public String marcaVehiculo;
    public int añoFabricacion;
    public double valorVehiculo;
    public double valorMatricula;
    public Automotor(int cedulaDueño, String marcaVehiculo, int añoFabricacion, double valorVehiculo){
        this.cedulaDueño = cedulaDueño;
        this.marcaVehiculo = marcaVehiculo;
        this.añoFabricacion = añoFabricacion;
        this.valorVehiculo = valorVehiculo;
    }
    public void calcularValorMatricula(){
        this.valorMatricula =((this.valorVehiculo * 0.00002)*(2025 - this.añoFabricacion));
    }
    public String toString(){
        return "Cedula del Dueño: " + this.cedulaDueño + "\n Marca del vehiculo: " + this.marcaVehiculo + "\n Año de fabricacion: " + this.añoFabricacion + "\n Valor del vehiculo: " + this.valorVehiculo + "$" + "\n Valor de la matricula: " + this.valorMatricula + "$";
    }
}
