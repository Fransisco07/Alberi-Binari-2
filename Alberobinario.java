public class Alberobinario {
    
    private NodoAlbero radice;

    public Alberobinario(){
        radice = null;
    }


    public void aggiungi(int valore){
        NodoAlbero nodo1, nodo2;

        NodoAlbero nodoNuovo = new NodoAlbero(valore);

        if(radice == null){
            radice = new NodoAlbero(valore);
        }

        else{
            nodo1 = radice;

            if(valore < nodo1.GetValore()){
                nodo2 = nodo1.GetFiglioSinistro();
            }
            else{
                nodo2 = nodo1.GetFiglioDestro();
            }

            while(nodo2 != null){
                nodo1 = nodo2;
                
                if(valore < nodo1.GetValore()){
                    nodo2 = nodo1.GetFiglioSinistro();
                }
                else{
                    nodo2 = nodo1.GetFiglioDestro();
                }
            }

            if(valore < nodo1.GetValore()){
                nodo1.SetFiglioSinistro(nodoNuovo);
            }
            else{
                nodo1.SetFiglioDestro(nodoNuovo);
            }
        }
    }

    
    public void VisitaAnticipata(NodoAlbero r){
        if(r == null){
            return;
        }
        
        System.out.println(r.GetValore());
        if(r.GetFiglioSinistro() != null){
            VisitaAnticipata(r.GetFiglioSinistro());
        }

        if(r.GetFiglioDestro() != null){
            VisitaAnticipata(r.GetFiglioDestro());
        }
    }

    public void VisitaDifferita(NodoAlbero r){
        if(r == null){
            return;
        }

        if(r.GetFiglioSinistro() != null){
            VisitaDifferita(r.GetFiglioSinistro());
        }

        if(r.GetFiglioDestro() != null){
            VisitaDifferita(r.GetFiglioDestro());
        }

        System.out.println(r.GetValore());
    }

}
