package entities;

public class Pingouin extends Aquatic{

    protected float swimmingDepth ;
    public Pingouin() {}
    public Pingouin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth ) {
        super(family, name, age, isMammal,habitat);
        this.swimmingDepth  = swimmingDepth ;
    }
    @Override
    public String toString() {
        return super.toString() + ", la\n" + "profondeur maximale de nage =" + swimmingDepth + " km/h";
    }

}
