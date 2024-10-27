public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int faithful;
    private int honest;

    public Hufflepuff(int transgressionDistance, int powerMagic, String totalName, int hardworking, int faithful, int honest) {
        super(transgressionDistance, powerMagic, totalName);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        this.faithful = faithful;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void print(){
        System.out.println(this.getTotalName() + toString() + " Пуффендуй, обладая трудолюбивостью на " + this.getHardworking() +
                ", верностью на " + this.getFaithful() + ", честностью на " + this.getHonest());
    }

    public void compareStudents(Hufflepuff people2){
        if (this.getHardworking() + this.getFaithful() + this.getHonest() > people2.getHardworking() + people2.getFaithful() + people2.getHonest()){
            System.out.println(this.getTotalName() + " лучший Пуффендуец, чем " + people2.getTotalName());
        }
        else if (this.getHardworking() + this.getFaithful() + this.getHonest() < people2.getHardworking() + people2.getFaithful() + people2.getHonest()) {
            System.out.println(people2.getTotalName() + " лучший Пуффендуец, чем " + this.getTotalName());
        }
        else {
            System.out.println("Оба ученика хороши");
        }
    }
}
