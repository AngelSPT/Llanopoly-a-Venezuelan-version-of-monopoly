package monopolio;

public class Casilla {
    
    int posicionCasilla;
    String nombreCasilla;
    String colorCasilla;
    int poj1x;
    int poj1y;
    int poj2x;
    int poj2y;
    int poj3x;
    int poj3y;
    
    public Casilla(int posicionCasilla, String nombreCasilla, String colorCasilla, int poj1x, int poj1y, int poj2x, int poj2y, int poj3x, int poj3y){
    
    this.posicionCasilla = posicionCasilla;
    this.nombreCasilla = nombreCasilla;
    this.colorCasilla = colorCasilla;
    this.poj1x = poj1x;
    this.poj1y = poj1y;
    this.poj2x = poj2x;
    this.poj2y = poj2y;
    this.poj3x = poj3x;
    this.poj3y = poj3y;
    }
    
    public String getNombreCasilla(){
    return this.nombreCasilla;
    
    }
    
    public int getPosicionCasilla(){
    return this.posicionCasilla;
    
    }

    public String getColorCasilla() {
        return colorCasilla;
    }
    
    public String getAtributos(){
    return "" +getNombreCasilla() + " " + getPosicionCasilla() + " " + getColorCasilla() +"/n";
    
    }
    
}


