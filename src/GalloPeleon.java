import javax.print.DocFlavor;

public class GalloPeleon extends Gallo {

    private boolean enFuria;
    public GalloPeleon(String nombre, double peso){
        super(nombre, peso,100,30);
        this.enFuria=false;

    }
    public boolean isEnFuria(){
        return enFuria;
    }

    public void setEnFuria(boolean furia){
        this.enFuria=furia;
    }

    @Override
    public String pelear(){
        if(enFuria){
            return getNombre()+" (peleon) ATACA FURIOSO con "+fuerza+" de fuerza! IMPARABLE!";
        }
        return getNombre()+" (peleon) ataca sin parar! Fuerza: "+fuerza;
    }
    @Override
    public String cacarear(){
        return getNombre()+": COOOOO! A pelear con todos! ";
    }
    public String enfurecerse(){
        if(enFuria)return getNombre()+" ya esta en furia!";
        enFuria=true;
        setFuerza(getFuerza()+15);
        return getNombre()+" ENTRA EN FURIA! fuerza aumentada a "+getFuerza();
    }
}
