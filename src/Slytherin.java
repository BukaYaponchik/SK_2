public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;

    public Slytherin(int transgressionDistance, int powerMagic, String totalName, int cunning, int determination, int ambition, int resourcefulness, int lustPower) {
        super(transgressionDistance, powerMagic, totalName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    public void print(){
        System.out.println(this.getTotalName() + toString() + " Слизерин, обладая хитростью на " + this.getCunning() +
                ", решительностью на " + this.getDetermination() + ", амбициозностью на " + this.getAmbition() +
                ", находчивостью на " + this.getResourcefulness() + ", жаждой власти на " + this.getLustPower());
    }

    public void compareStudents(Slytherin people2){
        if (this.getCunning() + this.getAmbition() + this.getDetermination() + this.getResourcefulness() + this.getLustPower() > people2.getCunning() + people2.getAmbition() + people2.getDetermination() + people2.getResourcefulness() + people2.getLustPower()){
            System.out.println(this.getTotalName() + " лучший Слизеринец, чем " + people2.getTotalName());
        }
        else if (this.getCunning() + this.getAmbition() + this.getDetermination() + this.getResourcefulness() + this.getLustPower() < people2.getCunning() + people2.getAmbition() + people2.getDetermination() + people2.getResourcefulness() + people2.getLustPower()){
            System.out.println(people2.getTotalName() + " лучший Слизеринец, чем " + this.getTotalName());
        }
        else {
            System.out.println("Оба ученика хороши");
        }
    }
}
