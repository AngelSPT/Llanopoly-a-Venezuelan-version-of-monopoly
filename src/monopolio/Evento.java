package monopolio;

import javax.swing.JOptionPane;

public class Evento extends Casilla{
    
    public Evento(int posicionCasilla, String nombreCasilla, String colorCasilla, int poj1x, int poj1y, int poj2x, int poj2y, int poj3x, int poj3y){
    super(posicionCasilla, nombreCasilla, colorCasilla, poj1x, poj1y, poj2x, poj2y, poj3x, poj3y);       
    }
    
    public int avanceDinamico(int totalDados, int cantidadPropiedades){
    int casillasAvance = 0;
    if(totalDados>=2 && totalDados<=6) casillasAvance = totalDados - 2;
    if(totalDados>=7 && totalDados<=10) casillasAvance = 3;
    if(totalDados>10) casillasAvance = totalDados - cantidadPropiedades;   
    return casillasAvance;
    }
    
    public int retrocesoDinamico(int totalDados, int cantidadPropiedades){
    int casillasAvance = 0;
    if(totalDados>=2 && totalDados<=6) casillasAvance = totalDados - cantidadPropiedades; 
    if(totalDados>=7 && totalDados<=10) casillasAvance = 3;
    if(totalDados>10) casillasAvance = totalDados - 2;
    return casillasAvance;
    }
    
    public void policia(Jugador jugadorActual){
    jugadorActual.setCarcel(true);
    jugadorActual.setPosicionJugador(8);
    }
    
    public void unimar(Jugador jugador){
        if(jugador.vecesUnimar == 0){
            jugador.setDinero(jugador.getDinero() + 50000);
            jugador.vecesUnimar = jugador.vecesUnimar + 1;
            JOptionPane.showMessageDialog(null, "¡Usted ha ganado $50000!", "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);
        }    
        else if(jugador.vecesUnimar == 1){
            jugador.setDinero(jugador.getDinero() + 30000);
            jugador.vecesUnimar = jugador.vecesUnimar + 1;
            JOptionPane.showMessageDialog(null, "¡Usted ha ganado $30000!", "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);
        }    
    }
    
    public void impuestoLujo(Jugador jugadorActual){
        int dineroJugador = jugadorActual.getDinero();
        int diezPorciento = (10 * dineroJugador) / 100;
        jugadorActual.setDinero(dineroJugador - diezPorciento);
        JOptionPane.showMessageDialog(null, "Usted ha caido en Impuesto al lujo \nTendra que pagar el 10% de todo su efectivo", "Impuesto al lujo", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
