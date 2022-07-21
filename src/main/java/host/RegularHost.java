package host;

import repository.Broadcasts;
import java.io.Serializable;

public class RegularHost extends Host implements Serializable {
    static final long serialVersionUID = 34094093409L;
    private int experience;
    
    public static RegularHost createHost(String name, Broadcasts broadcasts, int experience) {
        if (experience < 0)
            throw new IllegalArgumentException("experience can not be " + experience);
        if (broadcasts == null || name == null)
            throw new IllegalArgumentException("No null parameters allowed");
        
        return new RegularHost(name, broadcasts, experience);
    }

    private RegularHost(String name, Broadcasts broadcasts, int experience) {
        super(name, broadcasts);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void increaseExperience() {
        experience++;
    }

}
