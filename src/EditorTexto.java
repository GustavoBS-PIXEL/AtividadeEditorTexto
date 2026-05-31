import java.util.Stack;

public class EditorTexto {

    private No topo;

    public EditorTexto() {
        this.topo = null;
    }
    // Insere uma nova ação no topo da pilha encadeada
    public void realizarAcao(Acao novaAcao) {
        No novoNo = new No(novaAcao);
        novoNo.proximo = topo;
        topo = novoNo;
        System.out.println("Ação realizada -> " + novaAcao.toString());
    }

    // Remove a ação do topo da pilha encadeada (Desfazer)
    public void desfazer() {
        if (topo == null) {
            System.out.println("Aviso: Não há ações para desfazer.");
            return;
        }
        Acao desfeita = topo.acao;
        topo = topo.proximo;
        System.out.println("Desfazendo -> " + desfeita.toString());
    }

    // Percorre a lista encadeada do topo até o fim para listar as ações
    public void listarAcoes() {
        if (topo == null) {
            System.out.println("Aviso: Histórico vazio. Nenhuma ação para listar.");
            return;
        }
        System.out.println("\n--- Histórico de Ações (Topo -> Base) ---");
        No atual = topo; // Começa pelo topo
        while (atual != null) {
            System.out.println("-> " + atual.acao.toString());
            atual = atual.proximo; // Move para o nó de baixo
        }
        System.out.println("------------------------------------------");
    }
}