public class NodoAlbero {
    private NodoAlbero figlioDestro;
    private NodoAlbero figlioSinistro;
    private int valore;

    public NodoAlbero(int valore){
        this.valore = valore;
    }

    public NodoAlbero GetFiglioDestro(){
        return figlioDestro;
    }

    public NodoAlbero GetFiglioSinistro(){
        return figlioSinistro;
    }

    public int GetValore(){
        return valore;
    }

    public void SetFiglioSinistro(NodoAlbero r){
        figlioSinistro = r;
    }

    public void SetFiglioDestro(NodoAlbero r){
        figlioDestro = r;
    }
}
