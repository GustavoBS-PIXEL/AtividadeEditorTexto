import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        EditorTexto editor = new EditorTexto();
        int opcaoPrincipal = 0;

        System.out.println("=== EDITOR DE TEXTO (HISTÓRICO DE AÇÕES) ===");

        while (opcaoPrincipal != 4) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Realizar Nova Ação");
            System.out.println("2 - Desfazer Última Ação (Ctrl+Z)");
            System.out.println("3 - Listar Histórico de Ações");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcaoPrincipal = Integer.parseInt(leitor.nextLine());

                switch (opcaoPrincipal) {
                    case 1:
                        String tipo = "";
                        boolean subMenuValido = false;

                        // Laço do Submenu: O usuário fica preso aqui até digitar 1, 2 ou 3
                        while (!subMenuValido) {
                            System.out.println("\n-- ESCOLHA O TIPO DE AÇÃO --");
                            System.out.println("1 - Digitar");
                            System.out.println("2 - Apagar");
                            System.out.println("3 - Substituir a última palavra");
                            System.out.print("Opção: ");

                            String subOpcao = leitor.nextLine();

                            switch (subOpcao) {
                                case "1":
                                    tipo = "Digitar";
                                    subMenuValido = true;
                                    break;
                                case "2":
                                    tipo = "Apagar";
                                    subMenuValido = true;
                                    break;
                                case "3":
                                    tipo = "Substituir";
                                    subMenuValido = true;
                                    break;
                                default:
                                    System.out.println("[ERRO] Opção inválida! Escolha 1, 2 ou 3.");
                            }
                        }

                        System.out.print("Descrição do que foi feito (Ex: palavra digitada/apagada): ");
                        String desc = leitor.nextLine();

                        editor.realizarAcao(new Acao(tipo, desc));
                        break;

                    case 2:
                        editor.desfazer();
                        break;

                    case 3:
                        editor.listarAcoes();
                        break;

                    case 4:
                        System.out.println("Encerrando o sistema do editor...");
                        break;

                    default:
                        System.out.println("Opção inválida no Menu Principal! Escolha de 1 a 4.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, digite um número válido.");
            }
        }
        leitor.close();
    }
}