# Sistema de Desfazer de um Editor de Texto (Estrutura de Dados: Pilha)

**Aluno:** Gustavo
**Disciplina:** Estruturas de Dados

## 📝 Sobre o Projeto
Este projeto é uma aplicação Java em console que simula o mecanismo de "Desfazer" (Ctrl+Z) de um editor de texto. O sistema registra ações do usuário (Digitar, Apagar, Substituir) e permite revertê-las seguindo a lógica **LIFO** (*Last In, First Out* - O último a entrar é o primeiro a sair), característica fundamental da estrutura de dados Pilha (*Stack*).

O desenvolvimento foi dividido em duas etapas versionadas através de *commits* neste repositório, demonstrando a evolução de uma implementação manual de gerenciamento de memória para o uso de bibliotecas nativas da linguagem.

## ⚙️ Fases do Desenvolvimento

### Fase 1: Implementação Manual (Pilha Dinâmica com Lista Encadeada)
No *commit* `EditorTextoManual`, a Pilha foi construída do zero, sem o uso de bibliotecas prontas de coleções.
* **Classe `Acao`:** O modelo de dados (a carga) contendo o tipo de ação, descrição e o horário exato da execução.
* **Classe `No`:** O elemento estrutural (o vagão) que armazena a ação e um ponteiro para o nó anterior.
* **Classe `EditorTexto`:** O gerenciador que manipula os ponteiros para empilhar (`realizarAcao`) e desempilhar (`desfazer`) os nós de forma dinâmica e manual.

### Fase 2: Refatoração (Uso de Estruturas Prontas)
No *commit* `EditorTextoRefatorado`, a aplicação passou por uma refatoração estrutural.
* A classe estrutural `No` foi descartada.
* A classe `EditorTexto` passou a utilizar a biblioteca nativa `java.util.Stack`, delegando ao próprio Java o gerenciamento de índices, alocação de memória, e os métodos nativos `push()`, `pop()` e `isEmpty()`.
* A classe `Main` com o menu interativo continuou funcionando de forma idêntica, provando que a refatoração interna foi bem-sucedida e manteve o comportamento esperado do sistema.

## 🚀 Como Executar

1. Clone o repositório em sua máquina local.
2. Certifique-se de ter o JDK (Java Development Kit) instalado.
3. Navegue até o diretório onde os arquivos `.java` estão localizados.
4. Compile as classes:
   ```bash
   javac Main.java Acao.java EditorTexto.java
Execute o programa:

    java Main


🎥 Vídeo Demonstrativo

Acesse o link abaixo para assistir à explicação detalhada do código, o conceito de Pilhas e a demonstração prática das versões operando no terminal.

👉 [https://youtu.be/ZuoyBKcZ4Jk]