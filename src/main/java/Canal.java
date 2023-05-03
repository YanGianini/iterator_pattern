import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Canal implements Iterable<Video> {

    private List<Video> videos = new ArrayList<Video>();

    public Canal(Video... videos) {
        this.videos = Arrays.asList(videos);
    }

    @Override
    public Iterator<Video> iterator() {
        return videos.iterator();
    }
}
