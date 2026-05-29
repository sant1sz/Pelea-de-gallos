public class Gallo {

    private String nombre;
    private double peso;
    private int energia;
    private int victorias;
    private boolean estaActivo;
    protected int fuerza;

    public Gallo(String nombre,double peso,int energia,int fuerza){
        this.nombre=nombre;
        this.peso = peso;
        this.energia=energia;
        this.fuerza=fuerza;
        this.victorias=0;
        this.estaActivo=true;



    }
}
