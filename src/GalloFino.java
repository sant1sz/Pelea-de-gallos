public class GalloFino extends Gallo{

    private String colorPlumaje;
    public GalloFino(String nombre,double peso,String colorPlumaje){
        super(nombre, peso,70,45);
        this.colorPlumaje=colorPlumaje;
    }
    public String getColorPlumaje(){
        return colorPlumaje;

    }
    public void setColorPlumaje(String colorPlumaje){
        this.colorPlumaje=colorPlumaje;
    }
    @Override
    public String pelear(){
        return getNombre()+" (fino) Lanza un picotazo bien dado"+"Ataque preciso de "+fuerza+" de fuerza.";
    }
    @Override
    public String cacarear(){
        return getNombre()+" plumas "+colorPlumaje+ ":KI-KI-RI-KIIIIII!";
    }
    public String picotazoPreciso(){
        int daño =fuerza+20;
        setEnergia(getEnergia()-10);
        return getNombre()+" ejecuta picotazo PRECISOOO! Daño: "+daño+ " | Energia restante: "+getEnergia();
    }
}
