import java.util.Objects;

public class Nodo<T>{
    private T info;
    private Nodo puntatore;

    public Nodo(T info, Nodo puntatore){
        this.info=info;
        this.puntatore=puntatore;
    }

    public T getInfo() {
        return info;}

    public void setInfo(T info) {
        this.info = info;}

    public Nodo getPuntatore() {
        return puntatore;}

    public void setPuntatore(Nodo puntatore) {
        this.puntatore = puntatore;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nodo)) return false;
        Nodo<T> nodo = (Nodo<T>) o;
        return Objects.equals(info, nodo.info) && Objects.equals(puntatore, nodo.puntatore);
    }

    @Override
    public String toString() {
        return "Nodo{" + "info=" + info + ", puntatore=" + puntatore + '}';
    }
}