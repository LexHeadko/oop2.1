package OOP21;

public class Main {
    public static void main(String[] args) {
        FacultyGriffindor harryPotter = new FacultyGriffindor("Гарри Поттер",
                99,
                25,
                100,
                100,
                100);
        FacultyGriffindor ronWeasley = new FacultyGriffindor("Рон Уизли",
                88,
                15,
                75,
                85,
                65);
        FacultyGriffindor hermioneGranger = new FacultyGriffindor("Гермиона Грейнджер",
                77,
                16,
                86,
                94,
                83);
        FacultyHufflepuff cedricDiggory = new FacultyHufflepuff("Седрик Диггори",
                66,
                25,
                100,
                100,
                85);
        FacultyHufflepuff justinFinchFletchley = new FacultyHufflepuff("Джастин Финч-Флетчли",
                25,
                5,
                78,
                16,
                80);
        FacultyHufflepuff zachariasSmith = new FacultyHufflepuff("Захария Смит",
                12,
                20,
                45,
                35,
                85);
        FacultySlytherin dracoMalfoy = new FacultySlytherin("Драко Малфой",
                10,
                7,
                15,
                25,
                12,
                45,
                100);
        FacultySlytherin grahamMontague = new FacultySlytherin("Грэхэм Монтегю",
                73,
                76,
                19,
                45,
                1,
                35,
                60);
        FacultySlytherin gregoryGoyle = new FacultySlytherin("Грегори Гойл",
                50,
                57,
                55,
                55,
                52,
                55,
                80);
        FacultyRavenclaw choChang = new FacultyRavenclaw("Чжоу Чанг",
                64,
                55,
                55,
                55,
                55);
        FacultyRavenclaw padmaPatil = new FacultyRavenclaw("Падма Патил",
                64,
                55,
                55,
                55,
                55);
        FacultyRavenclaw marcusBelby = new FacultyRavenclaw("Маркус Белби",
                60,
                50,
                50,
                50,
                50);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        System.out.println(zachariasSmith);
        System.out.println(dracoMalfoy);
        System.out.println(gregoryGoyle);
        System.out.println(choChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        System.out.println(grahamMontague);
        hermioneGranger.printCompare(harryPotter);
        hermioneGranger.printCompare(dracoMalfoy);
        dracoMalfoy.printCompare(harryPotter);
        cedricDiggory.printCompare(justinFinchFletchley);
        cedricDiggory.printCompare(ronWeasley);
    }
}
