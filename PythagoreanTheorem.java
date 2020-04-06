

public class PythagoreanTheorem {
    public double calculateHypotenuse(int LegA, int LegB){
        double hypotenuse = Math.sqrt((Math.pow(LegA,2) + Math.pow(LegB,2)));
        return hypotenuse;
    }
}