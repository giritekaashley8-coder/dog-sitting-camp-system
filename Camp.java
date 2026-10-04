Camp.java
import java.util.ArrayList;
import java.util.List;

public class Camp {
    private String name;
    private List<PlayArea> playAreas;

    public Camp(String name) {
        this.name = name;
        this.playAreas = new ArrayList<>(3);
        this.playAreas.add(new PlayArea("Agility Park", 10));
        this.playAreas.add(new PlayArea("Quiet Zone", 5));
        this.playAreas.add(new PlayArea("Social Zone", 8));
    }

    public String getName() { return name; }
    public List<PlayArea> getPlayAreas() { return playAreas; }

    public void executeCommand(CampCommand cmd) {
        if (cmd != null) {
            cmd.execute();
        }
    }
}
