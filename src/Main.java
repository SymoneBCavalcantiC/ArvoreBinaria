public class Main {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserindo nós na árvore
        arvore.inserir(57);
        arvore.inserir(30);
        arvore.inserir(25);
        arvore.inserir(40);
        arvore.inserir(73);
        arvore.inserir(60);
        arvore.inserir(84);
        arvore.inserir(19);
        arvore.inserir(5);
        arvore.inserir(1);

        // Percorrendo a árvore em ordem
        System.out.println("Árvore em ordem:");
        arvore.percorrerEmOrdem();
    }
}
