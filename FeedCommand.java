
public class FeedCommand implements CampCommand {
    private Dog targetDog;

    public FeedCommand(Dog targetDog) {
        this.targetDog = targetDog;
    }

    @Override
    public void execute() {
        // Implementation here
    }
}
