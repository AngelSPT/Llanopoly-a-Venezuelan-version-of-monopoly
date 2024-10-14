package monopolio;

public class Propiedad extends Casilla {

    int precioPropiedad;
    int alquilerInicial;
    int alquiler1Casa;
    int precioCasa;
    boolean adquirida = false;
    
    public Propiedad(int posicionCasilla, String nombreCasilla, String colorCasilla, int poj1x, int poj1y,int poj2x, int poj2y, int poj3x, int poj3y, int precioPropiedad, int alquilerInicial, int alquiler1Casa, int precioCasa){
    
    super(posicionCasilla, nombreCasilla, colorCasilla, poj1x, poj1y, poj2x, poj2y, poj3x, poj3y);
    this.precioPropiedad = precioPropiedad;
    this.alquilerInicial = alquilerInicial;
    this.alquiler1Casa = alquiler1Casa;
    this.precioCasa = precioCasa;
    
    }
    
    public void setAdquirida(boolean adquiridaN){
    this.adquirida = adquiridaN;
    }
    
    public int getPrecioPropiedad(){
    return this.precioPropiedad;
    }
    
    public int getAlquilerInicial(){
    return this.alquilerInicial;
    }
    
    public int getAlquiler1Casa(){
    return this.alquiler1Casa;
    }
    
    public int getPrecioCasa(){
    return this.precioCasa;
    }
    
    public boolean getAdquirida(){
    return this.adquirida;
    }
    
}