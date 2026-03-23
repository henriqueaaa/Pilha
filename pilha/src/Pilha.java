public class Pilha {
    private No topo; // último elemento
    private int tamanho;

    public Pilha() {
        topo = null;
        tamanho = 0;
    }

    // Empilhar
    public void empilhar(String elemento) {
        No novo = new No(elemento);
        novo.prox = topo;
        topo = novo;
        tamanho++;
    }

    // Desempilhar
    public String desempilhar() {
        if (topo == null) return null;
        String removido = topo.conteudo;
        topo = topo.prox;
        tamanho--;
        return removido;
    }

    // Retorna o último elemento inserido
    public String mostrarUltimo() {
        if (topo == null) return null;
        return topo.conteudo;
    }

    // Verificar se está vazia
    public boolean estaVazia() {
        return topo == null;
    }

    //Tamanho da pilha
    public int tamanho() {
        return tamanho;
    }
}