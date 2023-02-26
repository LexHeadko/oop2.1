package OOP21;

public abstract class HogwartsSchool {
    private String name;
    private int magicPower;

    private int trangressionDist;

    public HogwartsSchool(String name, int magicPower, int trangressionDist) {
        this.name = name;
        this.magicPower = magicPower;
        this.trangressionDist = trangressionDist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrangressionDist() {
        return trangressionDist;
    }

    public void setTrangressionDist(int trangressionDist) {
        this.trangressionDist = trangressionDist;
    }

    public boolean compare(HogwartsSchool hogwartsSchool) {
        return this.magicPower + this.trangressionDist > hogwartsSchool.magicPower + hogwartsSchool.trangressionDist;
    }
    public void printCompare(HogwartsSchool hogwartsSchool) {
        if (this.compare(hogwartsSchool) == true) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + hogwartsSchool.getName() + "!");
        } else {
            System.out.println(hogwartsSchool.getName() + " обладает большей мощностью магии, чем " + this.getName() + "!");
        }
    }
    @Override
    public String toString() {
        return "Имя студента: " + name +
                ", Сила магии = " + magicPower +
                ", Дистанция трансгрессии = " + trangressionDist +
                ", ";
    }
}
