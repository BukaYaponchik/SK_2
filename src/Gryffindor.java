public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int transgressionDistance, int powerMagic, String totalName, int nobility, int honor, int bravery) {
        super(transgressionDistance, powerMagic, totalName);
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

    public void print(){
        System.out.println(this.getTotalName() + toString() + " Гриффиндор, обладая благоротством на " + this.getNobility() +
                ", честью на " + this.getHonor() + ", храбростью на " + this.getBravery());
    }

    public void compareStudents(Gryffindor people2){
        if (this.getNobility() + this.getHonor() + this.getBravery() > people2.getNobility() + people2.getHonor() + people2.getBravery()){
            System.out.println(this.getTotalName() + " лучший Гриффиндорец, чем " + people2.getTotalName());
        }
        else if (this.getNobility() + this.getHonor() + this.getBravery() < people2.getNobility() + people2.getHonor() + people2.getBravery()) {
            System.out.println(people2.getTotalName() + " лучший Гриффиндорец, чем " + this.getTotalName());
        }
        else {
            System.out.println("Оба ученика хороши");
        }
    }
}
