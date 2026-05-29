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
    public String getNombre(){
        return nombre;

    }
    public double getPeso(){
        return peso;
    }

    public int getEnergia() {
        return energia;
    }
    public int getFuerza(){
        return fuerza;

    }

    public int getVictorias() {
        return victorias;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    public void setEnergia(int energia){
        if(energia < 0)energia=0;
        this.energia=energia;
        if(this.energia==0)this.estaActivo=false;

    }

    public void setFuerza(int fuerza){
        this.fuerza=fuerza;
    }
    public void setEstaActivo(boolean v){
        this.estaActivo=v;
    }
    public void registrarVictoria(){
        this.victorias++;
    }
    public String pelear(){
        return nombre + "realizar un atasque basico!(fuerza: "+fuerza+")";

    }
    public String cacarear(){
        return nombre+ ": Co Co Co";
    }
    public String verEstado(){
        String estado= estaActivo ? "En pie" : "Caido";
        return "["+nombre +" | Energia: "+energia+ " | Victorias: "+victorias+" | "+estado+" ]";

    }
    @Override
    public String toString(){
        return nombre +" (peso: "+peso+" kg | Fuerza: "+fuerza+" | Energia: "+energia+")";
    }


}
