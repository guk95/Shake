package semana.pkg7;

public class Lista {

    private int size;
    private Nodo cabeza;

    public Lista() {
        this.size = 0;
        this.cabeza = null;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public boolean add(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (size == 0) {
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            int cont = 0;
            while (cont < size - 1) {

                aux = aux.getSig();
                cont++;
            }
            nuevo.setAnt(aux);
            aux.setSig(nuevo);

        }
        size++;
        return true;
    }

    public boolean shake(int index) {

        if (index < 0 || index > size - 1) {

            throw new IndexOutOfBoundsException("Ud es un animal");

        } else if (index < 2) {
            Nodo aux = cabeza.getSig();
            aux.getSig().setAnt(cabeza);
            cabeza.setSig(aux.getSig());
            aux.setSig(cabeza);
            cabeza.setAnt(aux);

            cabeza = aux;

        } else {

            Nodo aux = cabeza;
            Nodo auxcabeza = cabeza.getSig();
            Nodo auxultimo = cabeza;
            int cont = 0;
            int cont2 = 0;
            while (cont < size - 1) {
                auxultimo = auxultimo.getSig();
                cont++;
            }

            while (cont2 < index - 1) {
                aux = aux.getSig();
                cont2++;

            }

            aux.getSig().setAnt(cabeza);
            cabeza.setSig(aux.getSig());
            aux.setSig(cabeza);
            cabeza.setAnt(aux);
            cabeza = auxcabeza;

            Nodo aux2 = cabeza;
            int cont3 = 0;
            while (cont3 < size - index) {

                aux2 = aux2.getSig();
                cont3++;

            }
            aux2.getSig().setAnt(auxultimo);
            auxultimo.setSig(aux2.getSig());
            aux2.setSig(auxultimo);
            auxultimo.setAnt(aux2);

        }

        return true;

    }

    public String toString() {
        String resultado = "";
        StringBuilder str = new StringBuilder();
        str.append(" ");
        Nodo aux = cabeza;

        for (int i = 0; i < size; i++) {
            resultado += "   " + aux.getDato() + "  ";
            aux = aux.getSig();

        }

        return resultado;
    }
}
