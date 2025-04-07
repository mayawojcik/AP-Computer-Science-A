package Q4.VirtualPetLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomFoxImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Cat
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Cat
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Cat
    }
}
