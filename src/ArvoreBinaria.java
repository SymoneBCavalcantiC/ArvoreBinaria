
public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria(int valor) {
        raiz = new No(valor);
    }

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivamente(raiz, valor);
    }

    private No inserirRecursivamente(No no, int valor) {
        if (no == null) {
            no = new No(valor);
            return no;
        }

        if (valor < no.getValor())
            no.setEsquerda(inserirRecursivamente(no.getEsquerda(), valor));
        else if (valor > no.getValor())
            no.setDireita(inserirRecursivamente(no.getDireita(), valor));

        return no;
    }

    public void percorrerEmOrdem() {
        percorrerEmOrdemRecursivamente(raiz);
    }

    private void percorrerEmOrdemRecursivamente(No no) {
        if (no != null) {
            percorrerEmOrdemRecursivamente(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            percorrerEmOrdemRecursivamente(no.getDireita());
        }
    }
}