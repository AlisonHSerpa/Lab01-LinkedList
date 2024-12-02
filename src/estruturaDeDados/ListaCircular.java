package estruturaDeDados;

public class ListaCircular {
	
	private No head;
	private No tail;

    public ListaCircular() {
    	
    }
    
    public No getHead() {
    	return head;
    }
    
    public void setHead(No head) {
    	this.head = head;
    }
    
    public No getTail() {
    	return tail;
    }
    
    //recebe um No e faz ele apontar para a cabeca
    public void setTail(No tail) {
    	this.tail = tail;
    }
    
    public void insereInicio(int i) {
        //criando o No
        No n = new No(i);
        
        //se a lista estiver vazia, adiciona como head e faz ele ser o tail
        if (head == null) {
        	setHead(n);
        	setTail(n);
        }

        //seta como a nova cabeca
        n.setProximo(head);
        setHead(n);
        tail.setProximo(head);
    }

    public boolean buscaElemento(int i) {
        //se a lista estiver vazia, retorna falso
        if (head == null){
            return false;
        }

        //enquanto for diferente do valor, repete, se chegar na calda sai
        No n = head;
        while (n.getValor() != i){
            if (n == tail){
                return false;
            }
            else {
                n = n.getProximo();
            }
        }

        //se sair do loop, eh por que tem
        return true;
    }

    //recebe um indice, retorna o valor desse indice
    public int buscaIndice(int i) {
    	No n = head;
    	
    	for (int count=0; count<i; count++) {
    		n = n.getProximo();
    	}
    	
    	return n.getValor();
    }

    public void insereFim(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
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
