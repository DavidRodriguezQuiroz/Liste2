public class Liste<T> {
    private Noeud<T> premier;
    private int taille;

    public Liste(T... items) {
        taille = items.length;
        premier = new Noeud<T>();
        Noeud<T> noeudCourrant = premier;

        for (int i = 0; i<items.length; i++) {
            noeudCourrant.setValue(items[i]);

            if (i == items.length-1)
                break;

            noeudCourrant.setProchain(new Noeud<T>());
            noeudCourrant = noeudCourrant.getProchain();

        }
    }

    public Liste() {

    }

    private Noeud<T> getNoeudAt(int index) {
        Noeud<T> courrant;

        for (courrant = premier; index > 0; courrant = courrant.getProchain()) {
            index--;
        }

        return courrant;
    }

    public T getElementAt(int index) {
        if (index < 0 || index >= taille) {
            return null;
        }

        return getNoeudAt(index).getValue();
    }

    public void remove(int index) {
        if (index < 0 || index >= taille) {
            return;
        }

        if (index == 0) {
            premier = premier.getProchain();
            return;
        }

        Noeud<T> courrant = getNoeudAt(index - 1);
        courrant.setProchain(courrant.getProchain().getProchain());
        taille--;
    }

    public void ajouter(T valeur) {
        if (taille == 0) {
            premier = new Noeud<T>(valeur, null);
        }
        else {
            getNoeudAt(taille - 1).setProchain(new Noeud<T>(valeur, null));
        }
        taille++;
    }

    public void removeAll() {
        premier = null;
        taille = 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        if (premier == null)
            return "";

        for (Noeud<T> prochain = premier; prochain != null; prochain = prochain.getProchain()) {
            stringBuilder.append(prochain.getValue()).append(",");
        }

        return stringBuilder.substring(0, stringBuilder.length()-1);
    }
}
