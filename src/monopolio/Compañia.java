package monopolio;

public class Compañia extends Casilla{
    
    int precioCompañia;
    int cobro;
    boolean adquirida = false;
    
    public Compañia(int posicionCasilla, String nombreCasilla, String colorCasilla,int poj1x, int poj1y, int poj2x, int poj2y, int poj3x, int poj3y, int precioCompañia, int cobro){
    
    super(posicionCasilla, nombreCasilla, colorCasilla, poj1x, poj1y, poj2x, poj2y, poj3x, poj3y);
    this.precioCompañia = precioCompañia;
    this.cobro = cobro;
    }
    
    public int getPrecioCompañia(){
    return this.precioCompañia;
    }
    
    public int getCobro(){
    return this.cobro;
    }
    
    public boolean getAdquirida(){
    return this.adquirida;
    }
    
}
