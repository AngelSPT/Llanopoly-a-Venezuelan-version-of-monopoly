package monopolio;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Tablero extends javax.swing.JFrame {

    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/habitacion-vacia-fondo-estudio-abstracto-degradado-verde-liso-lujo-espacio-texto-e-imagen (1).jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/habitacion-vacia-fondo-estudio-abstracto-degradado-verde-liso-lujo-espacio-texto-e-imagen (1).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/307ce44aa3f88c19abcaef0f7065bb-unscreen (1).gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/1bca10621d29f89d55c70ec80f900e-unscreen (1).gif"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/a59641f45948d86a771d0dba91a97b-unscreen.gif"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, -1, -1));

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton2.setText("EMPEZAR PARTIDA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 210, 80));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel11.setText("\"Nombre\"");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/1bca10621d29f89d55c70ec80f900e-unscreen (1).gif"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/307ce44aa3f88c19abcaef0f7065bb-unscreen (1).gif"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/habitacion-vacia-fondo-estudio-abstracto-degradado-verde-liso-lujo-espacio-texto-e-imagen (1).jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel15.setText("\"Nombre\"");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/habitacion-vacia-fondo-estudio-abstracto-degradado-verde-liso-lujo-espacio-texto-e-imagen (1).jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/a59641f45948d86a771d0dba91a97b-unscreen.gif"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, -1, 80));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel19.setText("\"Nombre\"");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/habitacion-vacia-fondo-estudio-abstracto-degradado-verde-liso-lujo-espacio-texto-e-imagen (1).jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/TABLEROpeque - copia.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Llanos-venezolanos..jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Empezar partida boton
        jButton2.setVisible(false);
        initLogic();
        initGame();
    }//GEN-LAST:event_jButton2ActionPerformed
   
    public void initLogic(){
    
        // Inicializacion de la lista //
        lista.insertar(salida);
        lista.insertar(puntoFijo);
        lista.insertar(busMargarita);
        lista.insertar(caracas);
        lista.insertar(unimar);
        lista.insertar(nuevaEsparta);
        lista.insertar(corpoelec);
        lista.insertar(carcel);
        lista.insertar(valencia);
        lista.insertar(avanceDinamico);
        lista.insertar(banesco);
        lista.insertar(merida);
        lista.insertar(impuestoLujo);
        lista.insertar(maturin);
        lista.insertar(hidrocaribe);
        lista.insertar(policia);
        lista.insertar(monagas);
        lista.insertar(barinas);
        lista.insertar(retrocesoDinamico);
        lista.insertar(anzoategui);
        //lista.imprimir();
        jugadores[0] = J1;
        jugadores[1] = J2;
        jugadores[2] = J3;
    }
    
    public void initGame(){       
        JOptionPane.showMessageDialog(null, "Bienvenido a LLANOPOLY ", "¡Bienvenido!", JOptionPane.INFORMATION_MESSAGE);
        
        //Permite a los jugadores asignar nombres a sus personajes
        boolean nombrevalido=false;
        for(int i=0; i<3; i++){
            
            while (nombrevalido==false) {
            jugadores[i].setNombre(JOptionPane.showInputDialog("Ingrese el nick para el Jugador " + (i+1)));
            nombrevalido=true;
            if (jugadores[i].nombre == null || jugadores[i].nombre.trim().isEmpty()) {
                nombrevalido=false;
                JOptionPane.showMessageDialog(null, "Debes introducir algo.");
            } 
        }
            nombrevalido=false;
        } 
        jLabel11.setText(J1.nombre);
        jLabel15.setText(J2.nombre);
        jLabel19.setText(J3.nombre);
 
        JOptionPane.showMessageDialog(null, "A continuacion se decidira quien comenzara la partida", "...", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Esto mediante el lanzamiento de 3 pares de dados", "...", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El numero mas alto sera el primero en jugar", "...", JOptionPane.INFORMATION_MESSAGE);
        dJ1= random.nextInt(6) + 1 + random.nextInt(6) + 1;
        dJ2= random.nextInt(6) + 1 + random.nextInt(6) + 1;
        if(dJ2 == dJ1) dJ2 = dJ2-1;
        dJ3= random.nextInt(6) + 1 + random.nextInt(6) + 1;
        if(dJ2 == dJ3 | dJ3 == dJ1) dJ3 = dJ2-1;
        JOptionPane.showMessageDialog(null, "El jugador 1 obtiene el numero: " + dJ1, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El jugador 2 obtiene el numero: " + dJ2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El jugador 3 obtiene el numero: " + dJ3, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
        // Valida y asigna los turnos de los jugadores
        
        if (dJ1 > dJ2 && dJ1 > dJ3) {
            J1.turnoJugador = 3;
            JOptionPane.showMessageDialog(null, "El Jugador "+ J1.getNombre() + " tendra el primer turno", "Primer turno", JOptionPane.INFORMATION_MESSAGE);
            if (dJ2 > dJ3) {
                J2.turnoJugador = 2;
                J3.turnoJugador = 1;
            } else {
                J2.turnoJugador = 1;
                J3.turnoJugador = 2;
            }
        } else if (dJ2 > dJ1 && dJ2 > dJ3) {
            J2.turnoJugador = 3;
            JOptionPane.showMessageDialog(null, "El Jugador "+ J2.getNombre() + " tendra el primer turno", "Primer turno", JOptionPane.INFORMATION_MESSAGE);
            if (dJ1 > dJ3) {
                J1.turnoJugador = 2;
                J3.turnoJugador = 1;
            } else {
                J1.turnoJugador = 1;
                J3.turnoJugador = 2;
            }
        } else {
            J3.turnoJugador = 3;
            JOptionPane.showMessageDialog(null, "El Jugador "+ J3.getNombre() + " tendra el primer turno", "Primer turno", JOptionPane.INFORMATION_MESSAGE);
            if (dJ1 > dJ2) {
                J1.turnoJugador = 2;
                J2.turnoJugador = 1;
            } else {
                J1.turnoJugador = 1;
                J2.turnoJugador = 2;
            }
        }       
        //System.out.println("Turnos: " + J1.turnoJugador + " " + J2.turnoJugador + " " + J3.turnoJugador);
        
        System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
        System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
        System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
        
        mainLoop();
        jButton2.setVisible(true);
    }
    
    
    
    public void validarCasilla(){
    
        for(int i=0; i<3; i++){
            
            if (jugadores[i].turnoJugador == 3){
            
                if (jugadores[i].posicionJugador == 5 | jugadores[i].posicionJugador == 8 | jugadores[i].posicionJugador == 10 | jugadores[i].posicionJugador == 13 | jugadores[i].posicionJugador == 16 | jugadores[i].posicionJugador == 19| jugadores[i].posicionJugador == 1){ 
                switch (jugadores[i].posicionJugador){
                    case 5:
                        JOptionPane.showMessageDialog(null, "Caiste en UNIMAR", "Casilla", JOptionPane.INFORMATION_MESSAGE);   
                            if (jugadores[i].turnoJugador== 3) unimar.unimar(jugadores[i]);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                        break;
                    
                    case 8:
                        JOptionPane.showMessageDialog(null, "Caiste en Carcel", "Casilla", JOptionPane.INFORMATION_MESSAGE);    
                        break;
                        
                    case 10:
                        JOptionPane.showMessageDialog(null, "Caiste en Avance Dinamico", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        
                        for(int j=0; j<3; j++){
                        
                        if (jugadores[j].turnoJugador== 3) {
                            totaldados= avanceDinamico.avanceDinamico(totaldados, jugadores[j].cantidadPropiedades);
                            if (totaldados == 0) totaldados = 1;
                            JOptionPane.showMessageDialog(null, "Avanzaras la siguiente cantidad de casillas: "+totaldados, "Avance Dinamico", JOptionPane.INFORMATION_MESSAGE);
                                if (J1.turnoJugador==3) {
                                x= jLabel1.getX();
                                y= jLabel1.getY();

                                for (int movFal = 0; movFal < totaldados; movFal++){
                                    J1.setPosicionJugador((J1.getPosicionJugador() + 1));
                                    if(J1.getPosicionJugador()>20){
                                        J1.setPosicionJugador(1);
                                    }
                                    System.out.println(J1.getPosicionJugador());
                                    xn = lista.buscarPosicionX(J1.getPosicionJugador(), xn, J1, J2, J3);
                                    yn = lista.buscarPosicionY(J1.getPosicionJugador(), yn, J1, J2, J3);

                                    }
                                moverJugador(x, y, xn, yn);
                                }

                                if (J2.turnoJugador==3) {
                                x = jLabel2.getX();
                                y = jLabel2.getY();
                                for (int movFal = 0; movFal < totaldados; movFal++){
                                    J2.setPosicionJugador((J2.getPosicionJugador() + 1));
                                    if(J2.getPosicionJugador()>20){
                                        J2.setPosicionJugador(1);
                                    }
                                    System.out.println(J2.getPosicionJugador());
                                    xn= lista.buscarPosicionX(J2.getPosicionJugador(), xn, J1, J2, J3);
                                    yn= lista.buscarPosicionY(J2.getPosicionJugador(), yn, J1, J2, J3);

                                    }
                                moverJugador(x, y, xn, yn);
                                }
                                if (J3.turnoJugador==3) {
                                x= jLabel4.getX();
                                y= jLabel4.getY();
                                for (int movFal = 0; movFal < totaldados; movFal++){
                                    J3.setPosicionJugador((J3.getPosicionJugador() + 1));
                                    if(J3.getPosicionJugador()>20){
                                        J3.setPosicionJugador(1);
                                    }
                                    System.out.println(J3.getPosicionJugador());
                                    xn= lista.buscarPosicionX(J3.getPosicionJugador(), xn, J1, J2, J3);
                                    yn= lista.buscarPosicionY(J3.getPosicionJugador(), yn, J1, J2, J3);

                                    }
                                moverJugador(x, y, xn, yn);
                                }
                            }
                        } 
                        validarCasilla();
                        break;
                        
                    case 13:
                        JOptionPane.showMessageDialog(null, "Caiste en Impuesto al Lujo", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        impuestoLujo.impuestoLujo(jugadores[i]);
                        System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                        System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                        System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                        validarBancarrota(jugadores[i]);
                        break;
                        
                    case 16:
                        JOptionPane.showMessageDialog(null, "Caiste en Policia\n¡Iras a la carcel!", "Casilla", JOptionPane.INFORMATION_MESSAGE);  
                        
                        
                        policia.policia(jugadores[i]);
                        System.out.println(jugadores[i].getPosicionJugador());
                        xn= lista.buscarPosicionX(jugadores[i].getPosicionJugador(), xn, J1, J2, J3);
                        yn= lista.buscarPosicionY(jugadores[i].getPosicionJugador(), yn, J1, J2, J3);

                            
                        moverJugador(x, y, xn, yn);
                        
                        break;
                        
                    case 19:
                            JOptionPane.showMessageDialog(null, "Caiste en Retroceso Dinamico", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                            for(int j=0; j<3; j++){
                        if (jugadores[j].turnoJugador== 3) {
                            totaldados= retrocesoDinamico.retrocesoDinamico(totaldados, jugadores[j].cantidadPropiedades);
                            if (totaldados == 0) totaldados = 1;
                            JOptionPane.showMessageDialog(null, "Retrocederas la siguiente cantidad de casillas: "+totaldados, "Retroceso Dinamico", JOptionPane.INFORMATION_MESSAGE);
                        if (J1.turnoJugador==3) {
                        x= jLabel1.getX();
                        y= jLabel1.getY();
                        
                        for (int movFal = 0; movFal < totaldados; movFal++){
                            J1.setPosicionJugador((J1.getPosicionJugador() - 1));
                            System.out.println(J1.getPosicionJugador());
                            xn = lista.buscarPosicionX(J1.getPosicionJugador(), xn, J1, J2, J3);
                            yn = lista.buscarPosicionY(J1.getPosicionJugador(), yn, J1, J2, J3);

                            }
                        moverJugador(x, y, xn, yn);
                        }

                        if (J2.turnoJugador==3) {
                        x = jLabel2.getX();
                        y = jLabel2.getY();
                        for (int movFal = 0; movFal < totaldados; movFal++){
                            J2.setPosicionJugador((J2.getPosicionJugador() - 1));
                            System.out.println(J2.getPosicionJugador());
                            xn= lista.buscarPosicionX(J2.getPosicionJugador(), xn, J1, J2, J3);
                            yn= lista.buscarPosicionY(J2.getPosicionJugador(), yn, J1, J2, J3);

                            }
                        moverJugador(x, y, xn, yn);
                        }
                        if (J3.turnoJugador==3) {
                        x= jLabel4.getX();
                        y= jLabel4.getY();
                        for (int movFal = 0; movFal < totaldados; movFal++){
                            J3.setPosicionJugador((J3.getPosicionJugador() - 1));
                            System.out.println(J3.getPosicionJugador());
                            xn= lista.buscarPosicionX(J3.getPosicionJugador(), xn, J1, J2, J3);
                            yn= lista.buscarPosicionY(J3.getPosicionJugador(), yn, J1, J2, J3);

                            }
                        moverJugador(x, y, xn, yn);
                        }
                            }
                        } 
                        validarCasilla();
                            
                        break;
                        
                    case 1:
                        JOptionPane.showMessageDialog(null, "Caiste en Salida", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        break;
                       
                    
                }} else {
                    
                switch (jugadores[i].posicionJugador){    
                    case 2:
                            JOptionPane.showMessageDialog(null, "Caiste en Punto Fijo", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                            if (puntoFijo.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - puntoFijo.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ puntoFijo.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);
                            break;
                
                    case 3:
                        JOptionPane.showMessageDialog(null, "Caiste en Bus Margarita", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (busMargarita.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - (busMargarita.cobro * totaldados));
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ (busMargarita.cobro * totaldados) + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 4:
                        JOptionPane.showMessageDialog(null, "Caiste en Caracas", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (caracas.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - caracas.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ caracas.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Caiste en Nueva Esparta", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (nuevaEsparta.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - nuevaEsparta.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ nuevaEsparta.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Caiste en Corpoelec", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (corpoelec.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - (corpoelec.cobro * totaldados));
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ (corpoelec.cobro * totaldados) + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 9:
                        JOptionPane.showMessageDialog(null, "Caiste en Valencia", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (valencia.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - valencia.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ valencia.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 11:
                        JOptionPane.showMessageDialog(null, "Caiste en Banesco", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (banesco.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - (banesco.cobro * totaldados));
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ (banesco.cobro * totaldados) + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            }
                            validarBancarrota(jugadores[i]);

                    break;

                    case 12:
                        JOptionPane.showMessageDialog(null, "Caiste en Merida", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (merida.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - merida.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ merida.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 14:
                        JOptionPane.showMessageDialog(null, "Caiste en Maturin", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (maturin.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - maturin.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ maturin.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 15:
                        JOptionPane.showMessageDialog(null, "Caiste en Hidrocaribe", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (hidrocaribe.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - (hidrocaribe.cobro * totaldados));
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ (hidrocaribe.cobro * totaldados) + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            }
                            validarBancarrota(jugadores[i]);
                        
                    break;

                    case 17:
                        JOptionPane.showMessageDialog(null, "Caiste en Monagas", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (monagas.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - monagas.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ monagas.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 18:
                        JOptionPane.showMessageDialog(null, "Caiste en Barinas", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (barinas.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - barinas.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ barinas.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;

                    case 20:
                        JOptionPane.showMessageDialog(null, "Caiste en Anzoategui", "Casilla", JOptionPane.INFORMATION_MESSAGE);
                        if (anzoategui.adquirida == true){
                            jugadores[i].setDinero(jugadores[i].getDinero() - anzoategui.alquilerInicial);
                            JOptionPane.showMessageDialog(null, "Se acaban de pagar "+ anzoategui.alquilerInicial + " al propietario", "Cobro", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                            System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                            System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                            } 
                            validarBancarrota(jugadores[i]);

                    break;
                    
                }
                opcionesGenerales();
                        
                
                }
                    
                    
            }
            
        }
    
    } 
    
    public void opcionesGenerales(){
        // Mensaje y título del cuadro de diálogo
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué acción deseas realizar?", "Acciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);

        // Comprobar la opción seleccionada y ejecutar la línea de código correspondiente
        switch (opcionSeleccionada) {
            case 0: // Pasar turno
                // Línea de código para pasar turno
                System.out.println("Se pasa al siguiente turno");
                break;
            case 1: // Comprar propiedad
                // Línea de código para comprar una propiedad
                comprarPropiedad();
                System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                
                
                break;
            case 2: // Edificar
                // Línea de código para edificar
                JOptionPane.showMessageDialog(null, "No puedes edificar", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            default:
                // No se seleccionó ninguna opción válida
                break;
        }
    }
    
    public void comprarPropiedad(){
        for(int i=0; i<3; i++){
            if (jugadores[i].turnoJugador == 3){
                switch(jugadores[i].posicionJugador){ 
                    case 2:
                        if (puntoFijo.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Punto Fijo'\nPor "+ puntoFijo.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - puntoFijo.precioPropiedad;
                        puntoFijo.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }
                    break;

                    case 3:
                        if (busMargarita.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la compañia 'Bus Margarita'\nPor "+ busMargarita.precioCompañia, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - busMargarita.precioCompañia;
                        busMargarita.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }
                    break;

                    case 4:      
                        if (caracas.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Caracas'\nPor "+ caracas.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - caracas.precioPropiedad;
                        caracas.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }
                    break;

                    case 6:
                        if (nuevaEsparta.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Nueva Esparta'\nPor "+ nuevaEsparta.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - nuevaEsparta.precioPropiedad;
                        nuevaEsparta.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }

                    break;

                    case 7:
                        if (corpoelec.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la compañia 'Corpoelec'\nPor "+ corpoelec.precioCompañia, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - corpoelec.precioCompañia;
                        corpoelec.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }

                    break;

                    case 9:                    
                        if (valencia.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Valencia'\nPor "+ valencia.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - valencia.precioPropiedad;
                        valencia.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }                   

                    break;

                    case 11:                   
                        if (banesco.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la compañia 'Banesco'\nPor "+ banesco.precioCompañia, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - banesco.precioCompañia;
                        banesco.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }                  

                    break;

                    case 12:                   
                        if (merida.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Merida'\nPor "+ merida.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - merida.precioPropiedad;
                        merida.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }

                    break;

                    case 14:                   
                        if (maturin.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Maturin'\nPor "+ maturin.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - maturin.precioPropiedad;
                        maturin.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); } 

                    break;

                    case 15:
                        if (hidrocaribe.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la compañia 'Hidrocaribe'\nPor "+ hidrocaribe.precioCompañia, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - hidrocaribe.precioCompañia;
                        hidrocaribe.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }

                    break;

                    case 17:
                        if (monagas.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Monagas'\nPor "+ monagas.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - monagas.precioPropiedad;
                        monagas.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }

                    break;

                    case 18:
                        if (barinas.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Barinas'\nPor "+ barinas.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - barinas.precioPropiedad;
                        barinas.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }

                    break;

                    case 20:
                        if (anzoategui.adquirida == false){
                        JOptionPane.showMessageDialog(null, "Acabas de comprar la propiedad 'Anzoategui'\nPor "+ anzoategui.precioPropiedad, "Compra", JOptionPane.INFORMATION_MESSAGE);
                        jugadores[i].dinero = jugadores[i].dinero - anzoategui.precioPropiedad;
                        anzoategui.adquirida = true;
                        jugadores[i].cantidadPropiedades= jugadores[i].cantidadPropiedades+1;
                        } else{JOptionPane.showMessageDialog(null, "Esta propiedad no puede ser comprada", "Error", JOptionPane.ERROR_MESSAGE); }

                    break; 
                }
            }
            validarBancarrota(jugadores[i]);
        }
    
    }
    
    public void opcionesCarcel(){
        // Mensaje y título del cuadro de diálogo
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué acción deseas realizar?", "Acciones en carcel", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesCarcel, null);
        
        // Comprobar la opción seleccionada y ejecutar la línea de código correspondiente
        switch (opcionSeleccionada) {
            case 0:
                // Línea de código para pasar turno
                System.out.println("Se pasa al siguiente turno");
                break;
            case 1:
                // Línea de código para pagar fianza
                System.out.println("Se paga la fianza");
                for (int i = 0; i<3 ; i++){
                    if (jugadores[i].turnoJugador==3) {
                        jugadores[i].setDinero(jugadores[i].getDinero() - 45000);
                        jugadores[i].carcel = false;
                        jugadores[i].turnosCarcel = 0;
                        pagoFianza = true;
                        System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
                        System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
                        System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
                    }
                }
                break;
        }
    }
    
    public void mainLoop(){
        while(bancasrrotas < 2){
        System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
        System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
        System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
            mover();
            validarCasilla();
          if(J1.turnoJugador == 3){
            if (turnoDoble==false | turnoDobleN >= 2){
                J1.turnoJugador = 0;
                turnoDobleN = 0;
            }
        }    
          if(J2.turnoJugador == 3){
            if (turnoDoble==false | turnoDobleN >= 2){
                J2.turnoJugador = 0;
                turnoDobleN = 0;
            }
        }
          if(J3.turnoJugador == 3){
            if (turnoDoble==false | turnoDobleN >= 2){
                J3.turnoJugador = 0;
                turnoDobleN = 0;
            }
        }
        if (turnoDoble==false | turnoDobleN >= 2){
        J1.turnoJugador = J1.turnoJugador + 1;
        J2.turnoJugador = J2.turnoJugador + 1;
        J3.turnoJugador = J3.turnoJugador + 1;
            for(int i=0; i<3; i++){
                if (jugadores[i].turnoJugador == 3) JOptionPane.showMessageDialog(null, "es el turno de " + jugadores[i].getNombre(), "Siguiente turno", JOptionPane.INFORMATION_MESSAGE);
            } 
        } else{
            JOptionPane.showMessageDialog(null, "Se repite el turno", "¡Salieron dobles!", JOptionPane.INFORMATION_MESSAGE);
        }
        totaldados=0;
        System.out.println("Jugador: "+J1.nombre +"\nDinero: "+J1.dinero);
        System.out.println("Jugador: "+J2.nombre +"\nDinero: "+J2.dinero);
        System.out.println("Jugador: "+J3.nombre +"\nDinero: "+J3.dinero);
        }
        for (int i = 0; i<3 ; i++){
        if(jugadores[i].bancarrota== false) JOptionPane.showMessageDialog(null, "El ganador ha sido el jugador "+jugadores[i].nombre, "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public void lanzarDados(){
        dado1 = random.nextInt(6) + 1;
        dado2 = random.nextInt(6) + 1;
        JOptionPane.showMessageDialog(null, "El dado 1 ha dado: " + dado1 +  " | El dado 2 ha dado: "+dado2, "Resultado Dados", JOptionPane.INFORMATION_MESSAGE);
        totaldados = dado1 + dado2;
    }
    
    public void validarBancarrota(Jugador jugador){
    if (jugador.dinero <= 0 && jugador.turnoJugador == 3) {
        jugador.bancarrota= true;
        JOptionPane.showMessageDialog(null, "El Jugador " + jugador.nombre + " ha caido en bancarrota", "Lamentablemente", JOptionPane.INFORMATION_MESSAGE);
        bancasrrotas= bancasrrotas + 1;
        jugador.turnoJugador = 4;
        }
    }
    
    public void mover(){
        for (int i = 0 ; i<3 ; i++){
            if (jugadores[i].turnoJugador == 3 && jugadores[i].carcel == true && jugadores[i].turnosCarcel<4){
            opcionesCarcel();    
                if (jugadores[i].turnoJugador == 3 && jugadores[i].carcel == true && jugadores[i].turnosCarcel<4 && pagoFianza == false){
                jugadores[i].turnoJugador = 0;
                jugadores[i].turnosCarcel = jugadores[i].turnosCarcel + 1;
                J1.turnoJugador = J1.turnoJugador + 1;
                J2.turnoJugador = J2.turnoJugador + 1;
                J3.turnoJugador = J3.turnoJugador + 1;
                JOptionPane.showMessageDialog(null, "Se encuentra en la carcel", "Turno perdido para el jugador " + jugadores[i].getNombre(), JOptionPane.INFORMATION_MESSAGE);
                } else if (jugadores[i].turnoJugador == 3 && jugadores[i].carcel == true && jugadores[i].turnosCarcel>4){
                jugadores[i].carcel = false;
                jugadores[i].turnosCarcel = 0;

                }
            }
            pagoFianza = false;
        }
        JOptionPane.showMessageDialog(null, "Se lanzaran los dados", "Turno de " + nombreJugadorTurno(), JOptionPane.INFORMATION_MESSAGE);
        lanzarDados();
        if (dado1 == dado2){
        turnoDoble = true;
        turnoDobleN = turnoDobleN + 1;
        JOptionPane.showMessageDialog(null, "¡Salieron dobles!", "Resultado Dados", JOptionPane.INFORMATION_MESSAGE);
        } else{
        turnoDoble = false;
        turnoDobleN = 0;
        }
        System.out.println("Total dados: " + totaldados);
        if (J1.turnoJugador==3) {
        x= jLabel1.getX();
        y= jLabel1.getY();
        for (int movFal = 0; movFal < totaldados; movFal++){
            J1.setPosicionJugador((J1.getPosicionJugador() + 1));
            if(J1.getPosicionJugador()>20){
                J1.setPosicionJugador(1);
            }
            xn = lista.buscarPosicionX(J1.getPosicionJugador(), xn, J1, J2, J3);
            yn = lista.buscarPosicionY(J1.getPosicionJugador(), yn, J1, J2, J3);
            }
        System.out.println(J1.getPosicionJugador());
        moverJugador(x, y, xn, yn);
        }
        if (J2.turnoJugador==3) {
        x = jLabel2.getX();
        y = jLabel2.getY();
        for (int movFal = 0; movFal < totaldados; movFal++){
            J2.setPosicionJugador((J2.getPosicionJugador() + 1));
            if(J2.getPosicionJugador()>20){
                J2.setPosicionJugador(1);
            }
            xn= lista.buscarPosicionX(J2.getPosicionJugador(), xn, J1, J2, J3);
            yn= lista.buscarPosicionY(J2.getPosicionJugador(), yn, J1, J2, J3);
            }
        System.out.println(J2.getPosicionJugador());
        moverJugador(x, y, xn, yn);
        }
        if (J3.turnoJugador==3) {
        x= jLabel4.getX();
        y= jLabel4.getY();
        for (int movFal = 0; movFal < totaldados; movFal++){
            J3.setPosicionJugador((J3.getPosicionJugador() + 1));
            if(J3.getPosicionJugador()>20){
                J3.setPosicionJugador(1);
            }
            xn= lista.buscarPosicionX(J3.getPosicionJugador(), xn, J1, J2, J3);
            yn= lista.buscarPosicionY(J3.getPosicionJugador(), yn, J1, J2, J3);
            }
        System.out.println(J3.getPosicionJugador());
        moverJugador(x, y, xn, yn);
        }
    }
    
    private void moverJugador(int x, int y, int xn, int yn){
        if(J1.turnoJugador == 3){
            jLabel1.setLocation(xn, yn);
        }    
        if(J2.turnoJugador == 3){
            jLabel2.setLocation(xn, yn);
        }    
        if(J3.turnoJugador == 3){
            jLabel4.setLocation(xn, yn); 
        }        
    }
    public String nombreJugadorTurno(){
        for(int i=0; i<3; i++){
            if (jugadores[i].turnoJugador==3) {
            nombreJT = jugadores[i].nombre;
            }   
        }  
        return nombreJT;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                new Tablero().setVisible(true);            
                
            }
            
       });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
// Mis declaraciones   
    int x;
    int xn;
    int y;
    int yn;  
    Jugador J1 = new Jugador("Ganso", 1);
    Jugador J2 = new Jugador("Oso", 2);
    Jugador J3 = new Jugador("Vaca", 3);
    Jugador[] jugadores = new Jugador[3];
    boolean turnoDoble = false;
    boolean pagoFianza = false;
    int turnoDobleN = 0;
    int bancasrrotas;
    int dado1;
    int dado2;
    int totaldados;
    String[] opciones = {"Pasar turno", "Comprar propiedad", "Edificar"};
    String[] opcionesCarcel = {"Pasar turno", "Pagar fianza"};
    String nombreJT;
    Random random = new Random();
    int dJ1, dJ2, dJ3;    
    
    
        //Declaracion de las casillas
    
        Evento salida = new Evento(1, "Salida", "Negro", 640, 560, 570, 560, 600, 640);   
        Propiedad puntoFijo = new Propiedad(2, "Punto Fijo", "Morado",460, 560, 510, 590, 470, 650, 15000, 1500, 3500, 4000);
        Compañia busMargarita = new Compañia(3, "Bus Margarita", "Azul claro",360, 560, 410, 600, 360, 650, 38000, 450);
        PropiedadExtendida caracas = new PropiedadExtendida(4, "Caracas", "Amarillo", 260, 560, 300, 600, 250, 650, 25000, 2500, 3500, 5500, 4000, 6000, 9000);
        Evento unimar = new Evento(5, "Unimar", "Blanco",150, 560, 190, 600, 140, 650);   
        PropiedadExtendida nuevaEsparta = new PropiedadExtendida(6, "Nueva Esparta", "Amarillo",0, 560, 70, 600,0, 650, 20000, 2000, 3000, 5000, 3500, 5000, 8000);
        Compañia corpoelec = new Compañia(7, "Corpoelec", "Azul claro", 0, 460, 80, 450, 40, 500, 35000, 500);
        Evento carcel = new Evento(8, "Carcel", "Gris", 0, 350, 90, 350, 40, 390); 
        PropiedadExtendida valencia = new PropiedadExtendida(9, "Valencia", "Naranja", 0, 250, 100, 250, 40, 290, 18000, 1000, 1500, 2000, 2500, 3000, 3000);
        Evento avanceDinamico = new Evento(10, "Avance Dinamico", "Negro", 0, 150, 90, 150, 40, 190); 
        Compañia banesco = new Compañia(11, "Banesco", "Azul claro", 0, 0, 80, 20, 10, 80, 40000, 600);
        PropiedadExtendida merida = new PropiedadExtendida(12, "Merida", "Naranja", 150, 0, 200, 30, 150, 90, 20000, 1300, 1800, 2200, 2900, 3500, 3500);
        Evento impuestoLujo = new Evento(13, "Impuesto al Lujo", "Rojo", 250, 0, 300, 30, 250, 90); 
        PropiedadExtendida maturin = new PropiedadExtendida(14, "Maturin", "Verde",360, 0, 400, 30, 360, 90, 23000, 2000, 3250, 4500, 3850, 5500, 7500);
        Compañia hidrocaribe = new Compañia(15, "Hidrocaribe", "Azul claro",460, 0, 500, 30, 460, 90, 30000, 300);
        Evento policia = new Evento(16, "Policia", "Azul oscuro",560, 0, 650, 30, 570, 80); 
        PropiedadExtendida monagas = new PropiedadExtendida(17, "Monagas", "Verde",560, 150, 660, 150, 610, 190, 23000, 2000, 3250, 4500, 3850, 5500, 7500);
        Propiedad barinas = new Propiedad(18, "Barinas", "Morado",560, 250, 660, 260, 610, 290, 17000, 1800, 3800, 4800);
        Evento retrocesoDinamico = new Evento(19, "Retroceso Dinamico", "Gris",560, 360, 660, 360, 600, 400); 
        Propiedad anzoategui = new Propiedad(20, "Anzoategui", "Amarillo",560, 460, 660, 460, 600, 500, 25000, 2500, 4500, 7000);
        
        //Instanciacion de la lista
        
        Lista lista = new Lista();
}
