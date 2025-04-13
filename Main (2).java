public class Main{
    public static void main(String[] args){

        Alberobinario albero = new Alberobinario();

        albero.aggiungi(2);
        albero.aggiungi(5);
        albero.aggiungi(4);
        albero.aggiungi(7);
        albero.aggiungi(18);

        albero.VisitaAnticipata();

        albero.VisitaDifferita();;

    }
}