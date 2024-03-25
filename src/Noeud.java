public class Noeud<T> {
    private T value;
    private Noeud<T> prochain;

    public Noeud(T value, Noeud<T> prochain) {
        this.value = value;
        this.prochain = prochain;
    }

    public Noeud() {
    }

    public T getValue() {
        return value;
    }

    public Noeud<T> getProchain() {
        return prochain;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setProchain(Noeud<T> prochain) {
        this.prochain = prochain;
    }


}
