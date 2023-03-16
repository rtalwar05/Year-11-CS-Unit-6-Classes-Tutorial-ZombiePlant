public class ZombiePlant {

    private int potency;
    private int treatments;

    public ZombiePlant(int potency, int treatments) {
        this.potency = potency;
        this.treatments = treatments;
    }


    public int treatmentsNeeded() {
        return treatments;
    }

    public int getPotencyRequired() {
        return potency;
    }

    public boolean isDangerous()
    {
        if (treatments > 0)
        {
            return true;
        }

        return false;
    }

    public void treat (int p)
    {
       if (treatments > 0)
       {
           if (p <= potency && p > 0)
           {
               treatments = treatments - 1;
           }
           else if ( p > potency)
           {
               treatments++;
           }
       }

        if (treatments == 0 && p > potency)
        {
            treatments = 1;

        }

    }

}
