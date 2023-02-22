package OOP21;

public class FacultyRavenclaw extends HogwartsSchool {
    private int mind;
    private int wisdom;
    private int creativity;

    public FacultyRavenclaw(String name, int magicPower, int trangressionDist, int mind, int wisdom, int creativity) {
        super(name, magicPower, trangressionDist);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int totalPoint() {
        return this.creativity + this.mind + this.wisdom;
    }
    public boolean compare(FacultyRavenclaw facultyRavenclaw) {
        return this.totalPoint() > facultyRavenclaw.totalPoint();
    }
    public void printCompare(FacultyRavenclaw facultyRavenclaw) {
        if (this.compare(facultyRavenclaw) == true) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + facultyRavenclaw.getName() + "!");
        } else {
            System.out.println(facultyRavenclaw.getName() + " лучший Когтевранец, чем " + this.getName() + "!");
        }
    }
    @Override
    public String toString() {
        return "<<<Факультет Когтевран>>>" +
                super.toString() +
                "Разум = " + mind +
                ", Мудрость = " + wisdom +
                ", Творчество = " + creativity;
    }
}
