package Pilha;
public class pilha {
    class Node{
        String info;
        Node prox;
    }
    Node ini = null;
    int n = 0;
    boolean isEmpty(){
        return ini==null;
    }
    int size(){
        return n;
    }
    void push(String nome){
        if(search(nome)) {
            System.out.println("Nome já cadastrado\n");
        }
        else{
            Node novo = new Node();
            novo.info = nome;
            novo.prox = ini;
            ini = novo;
            n++;
        }
    }
    String pop () {
        String nome = "Lista vazia";
        if(!this.isEmpty()) {
            nome = ini.info;
            ini = ini.prox;
            n--;
            return nome;
        }
        return nome;
    }
    boolean search(String NomeBusca){
        if(!isEmpty()) {
            Node aux = ini;
            String nome;
            while (aux != null) {
                nome = aux.info;
                aux = aux.prox;
                if (NomeBusca.equalsIgnoreCase(nome)) return true;
            }
        }
        return false;
    }
    String toStr(){
        String ret="";
        if(!isEmpty()) {
            Node aux;
            aux = ini;
            while (aux !=null){
                ret+=aux.info+"\n";
                aux = aux.prox;
            }
        }
        return ret;
    }
}
