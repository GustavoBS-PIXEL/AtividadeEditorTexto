import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Acao {
    private String tipoAcao; // Ex: "Digitar texto", "Apagar texto", "Substituir palavras"
    private String descricao;
    private LocalDateTime horario;

    public Acao(String tipoAcao, String descricao) {
        this.tipoAcao = tipoAcao;
        this.descricao = descricao;
        this.horario = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "[" + horario.format(formatador) + "] " + tipoAcao + ": " + descricao;
    }
}