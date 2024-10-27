public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Kogtevran(int transgressionDistance, int powerMagic, String totalName, int smart, int wise, int witty, int creativity) {
        super(transgressionDistance, powerMagic, totalName);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void print(){
        System.out.println(this.getTotalName() + toString() + " Когтевран, обладая знаниями на " + this.getSmart() +
                ", мудростью на " + this.getWise() + ", остроумностью на " + this.getWitty() +
                ", творчеством на " + this.getCreativity());
    }

    public void compareStudents(Kogtevran people2){
        if (this.getSmart() + this.getWise() + this.getWitty() + this.getCreativity() > people2.getSmart() + people2.getWise() + people2.getWitty() + people2.getCreativity()){
            System.out.println(this.getTotalName() + " лучший Когтевранец, чем " + people2.getTotalName());
        }
        else if (this.getSmart() + this.getWise() + this.getWitty() + this.getCreativity() < people2.getSmart() + people2.getWise() + people2.getWitty() + people2.getCreativity()) {
            System.out.println(people2.getTotalName() + " лучший Когтевранец, чем " + this.getTotalName());
        }
        else {
            System.out.println("Оба ученика хороши");
        }
    }
}
