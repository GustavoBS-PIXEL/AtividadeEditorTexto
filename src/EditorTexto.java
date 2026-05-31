import java.util.Stack;

public class EditorTexto {

    private Stack<Acao> historico;
    public EditorTexto() {
        this.historico = new Stack<>();
    }

    public void realizarAcao(Acao novaAcao) {
        historico.push(novaAcao);
        System.out.println("Açao realizada: " + novaAcao.toString());
    }

    public void desfazer(){
        if(historico.isEmpty()){
            System.out.println("Não a nada para ser desfeito");
            return;
        }
        Acao acaoDesfeita = historico.pop();
        System.out.println("Desfeito: " + acaoDesfeita.toString());
    }

    public void listarAcoes(){
        if(historico.isEmpty()){
            System.out.println("Não a nada para ser listado");
            return;
        }
        System.out.println("-----Lista de Açoes-----");
        for(int i = historico.size() -1; i >= 0; i-- ){
            System.out.println();
            System.out.println(historico.get(i).toString());
        }
        System.out.println("---------------------------");
    }
}