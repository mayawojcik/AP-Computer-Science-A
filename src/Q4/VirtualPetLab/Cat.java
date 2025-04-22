package Q4.VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        super.setEnergy(getEnergy() + 10);
        if (super.getEnergy() > 100)
            super.setEnergy(100);
        if (super.getEnergy() < 0)
            super.setEnergy(0);
        super.setHappiness(getHappieness() + 10);
        if (super.getHappiness() > 100)
            super.setHappiness(100);
        if (super.getHappiness() < 0)
            super.setHappiness(0);
        super.setHunger(getHunger() - 10);
        if (super.getHunger() < 0)
            super.setHunger(0);
        if (super.getHunger() > 100)
            super.setHunger(100);
    }

    @Override
    public void play() {
        super.setHappiness(getHappiness() + 15);
        if (super.getHappiness() > 100)
            super.setHappiness(100);
        if (super.getHappiness() < 0)
            super.setHappiness(0);
        super.setEnergy(getEnergy() + 15);
        if (super.getEnergy() < 0)
            super.setEnergy(0);
        if (super.getEnergy() > 100)
            super.setEnergy(100);
        super.setHunger(getHunger() + 12);
        if (super.getHunger() > 100)
            super.setHunger(100);
        if (super.getHunger() < 0)
            super.setHunger(0);
    }

    @Override
    public void sleep() {
        super.setEnergy(getEnergy() + 10);
        if (super.getEnergy() > 100)
            super.setEnergy(100);
        if (super.getEnergy() < 0)
            super.setEnergy(0);
        super.setHunger(getHunger() + 12);
        if (super.getHunger() < 0)
            super.setHunger(0);
        if (super.getHunger() > 100)
            super.setHunger(100);
        super.setHappiness(getHappiness() + 10);
        if (super.getHappiness() > 100)
            super.setHappiness(100);
        if (super.getHappiness() < 0)
            super.setHappiness(0);
    }
}
