package host;

import java.io.Serializable;

public class RegularHost extends Host implements Serializable {
    static final long serialVersionUID = 34094093409L;
    private int experience;
    
    public static RegularHost createHost(String name, int experience) {
        if (experience < 0)
            throw new IllegalArgumentException("experience can not be " + experience);
        if (name == null)
            throw new IllegalArgumentException("No null parameters allowed");
        
        return new RegularHost(name, experience);
    }

    private RegularHost(String name, int experience) {
        super(name);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void increaseExperience() {
        experience++;
    }

}
