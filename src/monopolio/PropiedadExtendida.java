package monopolio;

public class PropiedadExtendida extends Propiedad{
    
    int alquiler2Casa;
    int alquiler1Hotel;
    int precioHotel;
    
    public PropiedadExtendida(int posicionCasilla, String nombreCasilla, String colorCasilla, int poj1x, int poj1y, int poj2x, int poj2y, int poj3x, int poj3y,int precioPropiedad, int alquilerInicial, int alquiler1Casa, int precioCasa, int alquiler2Casa, int alquiler1Hotel, int precioHotel){
    
        super(posicionCasilla, nombreCasilla, colorCasilla,poj1x, poj1y, poj2x, poj2y, poj3x, poj3y, precioPropiedad, alquilerInicial, alquiler1Casa, precioCasa);
        this.alquiler2Casa = alquiler2Casa;
        this.alquiler1Hotel = alquiler1Hotel;
        this.precioHotel = precioHotel;
    }
    
    public int getAlquiler2Casa(){
    return this.alquiler2Casa;
    }
    
    public int getAlquiler1Hotel(){
    return this.alquiler1Hotel;
    }
    
    public int getPrecioHotel(){
    return this.precioHotel;
    }
    
}
