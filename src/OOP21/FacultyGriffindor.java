package OOP21;

public class FacultyGriffindor extends HogwartsSchool {

    private int nobility;
    private int honor;
    private int bravery;

    public FacultyGriffindor(String name, int magicPower, int trangressionDist, int nobility, int honor, int bravery) {
        super(name, magicPower, trangressionDist);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int totalPoint() {
        return this.bravery + this.honor + this.nobility;
    }
    public boolean compare(FacultyGriffindor facultyGriffindor) {
        return this.totalPoint() > facultyGriffindor.totalPoint();
    }

    public void printCompare(FacultyGriffindor facultyGriffindor) {
        if (this.compare(facultyGriffindor) == true) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + facultyGriffindor.getName());
        } else {
            System.out.println(facultyGriffindor.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }
    @Override
    public String toString() {
        return "<<<Факультет Гриффиндор>>> " +
                super.toString() +
                "Благородство = " + nobility +
                ", Честь = " + honor +
                ", Храбрость = " + bravery;
    }
}
