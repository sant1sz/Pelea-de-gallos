public class GalloCampero extends Gallo{

    private String procedencia;
    public GalloCampero(String nombre, double peso,String procedencia){
        super(nombre, peso,120,20);
        this.procedencia=procedencia;
    }
    public String getProcedencia(){
        return procedencia;
    }
    public void setProcedencia(String p){
        this.procedencia=p;
    }
    @Override
    public String pelear(){
        return getNombre()+" (campero) Le mete el pico sin miedo!"+" Golpe duro de "+fuerza+" de fuerza.";
    }
    @Override
    public String cacarear(){
        return getNombre()+" desde "+procedencia+": KIKIRIKIIIII rudo y fuerte! ";

    }
    public String resistir(){
        int nueva=getEnergia()+ 15;
        if(nueva > 120)nueva=120;// correccion, tope de energia
        setEnergia(nueva);
        return getNombre()+" aguanta y se repone! Energia: "+getEnergia();
    }


}
