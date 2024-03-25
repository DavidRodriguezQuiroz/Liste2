public class Main {
    public static void main(String[] args) {
        Liste<String> liste = new Liste<>();
        liste.getElementAt(5);
        liste.remove(5);
        liste.remove(-5);

        liste.ajouter("a");
        liste.ajouter("ad");

        System.out.println(liste.toString());
    }
}
