package OOP21;

public class FacultySlytherin extends HogwartsSchool {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public FacultySlytherin(String name, int magicPower,
                            int trangressionDist, int cunning,
                            int determination, int ambition,
                            int resourcefulness, int thirstForPower) {
        super(name, magicPower, trangressionDist);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    private int totalPoint() {
        return this.ambition + this.cunning + this.determination
                + this.ambition + this.thirstForPower;
    }
    public boolean compare(FacultySlytherin facultySlytherin) {
        return this.totalPoint() > facultySlytherin.totalPoint();
    }
    public void printCompare(FacultySlytherin facultySlytherin) {
        if (this.compare(facultySlytherin) == true) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + facultySlytherin.getName() + "!");
        } else {
            System.out.println(facultySlytherin.getName() + " лучший Когтевранец, чем " + this.getName() + "!");
        }
    }
    @Override
    public String toString() {
        return "<<<Факультет Слизерин>>>" +
                super.toString() +
                "Хитрость = " + cunning +
                ", Решительность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + thirstForPower;
    }
}
