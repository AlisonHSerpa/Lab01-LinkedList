package estruturaDeDados;

public class Lista {

    private No head;

    public Lista() {

    }

    public No getHead(){
        return head;
    }

    public void setHead(No head){
        this.head = head;
    }

    public void insereInicio(int i) {
        //criando no que sera a nova cabeca
        No n = new No(i);

        //seta como a nova cabeca
        n.setProximo(head);
        setHead(n);
    }

    public boolean buscaElemento(int i) {
        //se nao existe, retorna falso
        if (head == null){
            return false;
        }

        //procura o valor e se chegar no ultimo e nao achar, eh falso
        No n = head;
        while (n.getValor() != i){
            if (n.getProximo() != null){
                return false;
            }
            n = n.getProximo();
            System.out.println("d");
        }
        System.out.println(n.getValor());
        //se sair do loop, eh por que achou
        return true;
    }

    public int buscaIndice(int i) {
        //contador para percorrer a lista
        int count = 0;

        //enquanto nao chegar no indice, ele percorre
        No n = head;
        while(n.getProximo() != null){
            if (n.getValor() == i){
                return count;
            }
            n = n.getProximo();
            count++;
        }
        
        //Nao tem esse indice
        return -1;
    }

    public void insereFim(int i) {
        //se nao existir cabeca, ele cria um No e adiciona
        if (head == null){
            head = new No(i);
            return;
        }
        //percorre a lista para achar o ultimo
        No n = head;
        while (n.getProximo() != null){
            n = n.getProximo();
        }
        //cria o ultimo e coloca o penultimo para apontar para o ultimo
        No last = new No(i);
        n.setProximo(last);
    }

    public void removeInicio() {
        //define que a nova cabeca deve ser o proximo No da antiga cabeca
        No newHead = head.getProximo();
        //seta a nova cabeca
        setHead(newHead);
    }

    public void removeFim() {
        //o No n vai percorrer a lista, o No Before
        No n = head;

        //percorre a lista para achar o fim
        while (n.getProximo() != null){
            n = n.getProximo();
        }
    }

    public void removeIndice(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    public void insereElementoPosicao(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }
    
}
