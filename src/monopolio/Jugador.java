package monopolio;

public class Jugador {
    
    String nombre;
    int id;
    int vecesUnimar=0;
    int dinero = 100000;
    int posicionJugador=1;
    int turnoJugador=0;
    int cantidadPropiedades=0;
    boolean bancarrota = false;
    boolean carcel = false;
    int turnosCarcel=0;
    
    public Jugador(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        
    }
    
    public void setDinero(int dineroN){
    this.dinero = dineroN;
    }
    
    public void setPosicionJugador(int posicionJugador){
    this.posicionJugador = posicionJugador;
    }
    
    public void setCantidadPropiedades(int cantidadPropiedadesN){
    this.cantidadPropiedades = cantidadPropiedadesN;
    
    }
    
    public void setBancarrota(boolean bancarrotaN){
    this.bancarrota = bancarrotaN;
    
    }
    
    public void setCarcel(boolean carcelN){
    this.carcel = carcelN;
    }
    public void setNombre(String nombreN){
    this.nombre = nombreN;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public int getDinero(){
    return this.dinero;
    }
    
    public int getCantidadPropiedades(){
    return this.cantidadPropiedades;
    }
    
    public boolean getBancarota(){
    return this.bancarrota;
    }
    
    public int getPosicionJugador(){
    return this.posicionJugador;
    }
}
