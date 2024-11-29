package estruturaDeDados;

public class No {
    int valor;
    No prox;

    public No(int valor){
        setValor(valor);
    }

    public int getValor(){
        return this.valor;
    }

    public No getProximo(){
        return this.prox;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setProximo(No prox){
        this.prox = prox;
    }
    
}