public class Main {
    public static void main(String[] args) {
        Gryffindor people1 = new Gryffindor(10, 10, "Гарри Поттер", 91, 93, 91);
        Gryffindor people2 = new Gryffindor(6, 5, "Гермиона Грейнджер", 86, 88, 85);
        Gryffindor people3 = new Gryffindor(8, 7, "Рон Уизли", 91, 89, 89);

        Hufflepuff people4 = new Hufflepuff(5, 6, "Захария Смит", 77, 59, 56);
        Hufflepuff people5 = new Hufflepuff(7, 4, "Седрик Диггори", 51, 89, 67);
        Hufflepuff people6 = new Hufflepuff(3, 3, "Джастин Финч-Флетчли", 91, 89, 79);

        Kogtevran people7 = new Kogtevran(6, 4, "Чжоу Чанг", 61, 59, 79, 97);
        Kogtevran people8 = new Kogtevran(5, 3, "Падма Патил", 41, 69, 89, 66);
        Kogtevran people9 = new Kogtevran(3, 8, "Маркус Белби", 81, 59, 99, 57);

        Slytherin people10 = new Slytherin(4, 7, "Грэхэм Монтегю", 91, 89, 89, 85, 67);
        Slytherin people11 = new Slytherin(8, 8, "Драко Малфой", 91, 89, 89, 89, 87);
        Slytherin people12 = new Slytherin(6, 6, "Грегори Гойл", 91, 89, 89, 76, 67);

        people1.print();
        people4.print();
        people7.print();
        people10.print();

        people2.compareStudents(people3);
        people5.compareStudents(people6);
        people8.compareStudents(people9);
        people11.compareStudents(people12);

        people1.compareStudents(people4);
        people7.compareStudents(people10);
        people4.compareStudents(people7);
        people1.compareStudents(people10);

    }
}