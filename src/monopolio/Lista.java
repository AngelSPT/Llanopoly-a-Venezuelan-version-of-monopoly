package monopolio;

public class Lista {
    private Nodo cabeza;
    private Nodo cola;

    public Lista() {
        cabeza = null;
        cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertar(Casilla nuevaCasilla) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.casillaNodo = nuevaCasilla;

        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.siguiente = cola;
            cola.anterior = cabeza;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza;
            cabeza.anterior = cola;
        }
    }

    public void eliminar(Casilla casillaBorrar){
        if (!estaVacia()) {
            Nodo nodoActual = cabeza;

            while (nodoActual != cola && nodoActual.casillaNodo != casillaBorrar) {
                nodoActual = nodoActual.siguiente;
            }

            if (nodoActual.casillaNodo == casillaBorrar) {
                if (nodoActual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cabeza.anterior = cola;
                    cola.siguiente = cabeza;
                } else if (nodoActual == cola) {
                    cola = cola.anterior;
                    cola.siguiente = cabeza;
                    cabeza.anterior = cola;
                } else {
                    nodoActual.anterior.siguiente = nodoActual.siguiente;
                    nodoActual.siguiente.anterior = nodoActual.anterior;
                }
            }
        }
    }

    public void imprimir() {
        if (!estaVacia()) {
            Nodo nodoActual = cabeza;

            do {
                System.out.println(nodoActual.casillaNodo.getAtributos());
                nodoActual = nodoActual.siguiente;
            } while (nodoActual != cabeza);
        }
    }
    
    public int buscarPosicionX(int posicion, int xn, Jugador J1, Jugador J2, Jugador J3){
        Nodo actual = new Nodo();
        actual = cola;
        boolean encontrado = false;
        do{
            if(actual.casillaNodo.getPosicionCasilla() == posicion){
                encontrado = true;
                if(J2.turnoJugador == 3) xn = actual.casillaNodo.poj1x;
                if(J1.turnoJugador == 3) xn = actual.casillaNodo.poj2x;
                if(J3.turnoJugador == 3) xn = actual.casillaNodo.poj3x;
            }
            actual=actual.anterior;
        } while(actual!=cola);
        if(encontrado==true){
            //System.out.println("nodo encontrado");
        } else{
            //System.out.println("no encontrado");
        }
        return xn;
    }
    
    public int buscarPosicionY(int posicion, int yn, Jugador J1, Jugador J2, Jugador J3){
        Nodo actual = new Nodo();
        actual = cola;
        boolean encontrado = false;
        do{
            if(actual.casillaNodo.getPosicionCasilla() == posicion){
                encontrado = true;
                if(J2.turnoJugador == 3) yn = actual.casillaNodo.poj1y;
                if(J1.turnoJugador == 3) yn = actual.casillaNodo.poj2y;
                if(J3.turnoJugador == 3) yn = actual.casillaNodo.poj3y;
            }
            actual=actual.anterior;
        } while(actual!=cola);
        if(encontrado==true){
            //System.out.println("nodo encontrado");
        } else{
            //System.out.println("no encontrado");
        }
        return yn;
    }
    
}