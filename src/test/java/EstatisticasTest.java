import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstatisticasTest {

    Canal canal;
    @BeforeEach
    void setUp() {
        canal = new Canal(
            new Video("Video1", true),
            new Video("Video 2", true),
            new Video("Video banido", false)
        );
    }

    @Test
    void deveContarVideosDisponiveis() {
        assertEquals(2, Estatisticas.contarVideosDisponiveis(canal));
    }

    @Test
    void deveContarTodosVideos() {
        assertEquals(3, Estatisticas.contarTotalVideos(canal));
    }

}
