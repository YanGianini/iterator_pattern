import java.util.Iterator;

public class Estatisticas {

    public static Integer contarVideosDisponiveis(Canal canal) {
        int qnt = 0;
        for (Video video : canal) {
            if (video.isDisponivel()){
                qnt++;
            }
        }return qnt;
    }

    public static Integer contarTotalVideos(Canal canal) {
        int qtn = 0;
        for (Iterator a = canal.iterator(); a.hasNext(); ) {
            qtn++;
            a.next();
        }
        return qtn;
    }

}
