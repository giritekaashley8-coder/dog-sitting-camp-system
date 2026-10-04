public class TransferCommand implements CampCommand {
    private Dog targetDog;
    private PlayArea targetArea;

    public TransferCommand(Dog targetDog, PlayArea targetArea) {
        this.targetDog = targetDog;
        this.targetArea = targetArea;
    }

    @Override
    public void execute() {
        // Implementation here
    }
}
