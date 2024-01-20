public class ZombiePlant {
    private int treatments;
    private int Potency;

    public ZombiePlant(int Potency, int Treatments){
        this.treatments = Treatments;
        this.Potency = Potency;
    }
    public int getPotencyRequired(){
        return Potency;
    }

    public int treatmentsNeeded(){
        return treatments;
    }
    public boolean isDangerous(){
        if (treatments >= 1){
            return true;
        }
        return false;
    }
    public void treat(int treat){
        if (treat<=Potency&& treat>0 && treatments!=0){
            treatments--;
        }
        else if (treat>Potency){
            treatments++;
        }
    }







}
