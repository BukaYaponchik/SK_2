public class Hogwarts {
    private final String totalName;
    private int powerMagic;
    private int transgressionDistance;

    public Hogwarts(int transgressionDistance, int powerMagic, String totalName) {
        this.transgressionDistance = transgressionDistance;
        this.powerMagic = powerMagic;
        this.totalName = totalName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getTotalName() {
        return totalName;
    }

    @Override
    public String toString() {
        return " - ученик школы Хогвартса обладает определенными качествами для своего факультета";
    }

    public void compareStudents(Hogwarts people2){
        if (this.getPowerMagic() + this.getTransgressionDistance() > people2.getPowerMagic() + people2.getTransgressionDistance()){
            System.out.println(this.getTotalName() + " обладает бОльшей мощностью магии, чем " + people2.getTotalName());
        }
        else if (this.getPowerMagic() + this.getTransgressionDistance() < people2.getPowerMagic() + people2.getTransgressionDistance()) {
            System.out.println(people2.getTotalName() + " обладает бОльшей мощностью магии, чем " + this.getTotalName());
        }
        else {
            System.out.println("Оба ученика хороши");
        }
    }
}
