package OOP21;

public class FacultyHufflepuff extends HogwartsSchool {
    private int HardWork;
    private int loyalty;
    private int honesty;

    public FacultyHufflepuff(String name, int magicPower, int trangressionDist, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, trangressionDist);
        this.HardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return HardWork;
    }

    public void setHardWork(int hardWork) {
        HardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    private int totalPoint() {
        return this.HardWork + this.loyalty + this.honesty;
    }
    public boolean compare(FacultyHufflepuff facultyHufflepuff) {
        return this.totalPoint() > facultyHufflepuff.totalPoint();
    }
    public void printCompare(FacultyHufflepuff facultyHufflepuff) {
        if (this.compare(facultyHufflepuff) == true) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + facultyHufflepuff.getName() + "!");
        } else {
            System.out.println(facultyHufflepuff.getName() + " лучший Пуффендуец, чем " + this.getName() + "!");
        }
    }
    @Override
    public String toString() {
        return "<<<Факультет Пуффендуй>>> " +
                super.toString() +
                "Трудолюбие = " + HardWork +
                ", Верность" + loyalty +
                ", Честность =" + honesty;
    }
}
