package Q4.VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        Pet.setEnergy(getEnergy() + 10);
        if (Pet.getEnergy() > 100)
            Pet.getEnergy(100);
        if (Pet.getEnergy() < 0)
            Pet.getEnergy(0);
        Pet.setHappiness(getHappieness() + 10);
        if (Pet.getHappiness() > 100)
            Pet.getHappiness(100);
        if (Pet.getHappiness() < 0)
            Pet.getHappiness(0);
        Pet.setHunger(getHunger() - 10);
        if (Pet.getHunger() < 0)
            Pet.getHunger(0);
        if (Pet.getHunger() > 100)
            Pet.getHunger(100);
    }

    @Override
    public void play() {
        Pet.setHappiness(getHappiness() + 15);
        if (Pet.getHappiness() > 100)
            Pet.setHappiness(100);
        if (Pet.getHappiness() < 0)
            Pet.setHappiness(0);
        Pet.setEnergy(getEnergy() + 15);
        if (Pet.getEnergy() < 0)
            Pet.setEnergy(0);
        if (Pet.getEnergy() > 100)
            Pet.setEnergy(100);
        Pet.setHunger(getHunger() + 12);
        if (Pet.getHunger() > 100)
            Pet.setHunger(100);
        if (Pet.getHunger() < 0)
            Pet.setHunger(0);
    }

    @Override
    public void sleep() {
        Pet.setEnergy(getEnergy() + 10);
        if (Pet.getEnergy() > 100)
            Pet.setEnergy(100);
        if (Pet.getEnergy() < 0)
            Pet.setEnergy(0);
        Pet.setHunger(getHunger() + 12);
        if (Pet.getHunger() < 0)
            Pet.setHunger(0);
        if (Pet.getHunger() > 100)
            Pet.setHunger(100);
        Pet.setHappiness(getHappiness() + 10);
        if (Pet.getHappiness() > 100)
            Pet.setHappiness(100);
        if (Pet.getHappiness() < 0)
            Pet.setHappiness(0);
    }
}
