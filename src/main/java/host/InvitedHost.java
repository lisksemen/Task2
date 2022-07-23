package host;

import repository.Broadcasts;

import java.io.Serializable;
import java.util.List;

public class InvitedHost extends Host implements Serializable {
    static final long serialVersionUID = 17643643434348L;
    private final String resume;


    public static InvitedHost createHost(String name, String resume) {
        if (name == null || resume == null)
            throw new IllegalArgumentException("No null parameters allowed");

        return new InvitedHost(name, resume);
    }

    private InvitedHost(String name, String resume) {
        super(name);
        this.resume = resume;
    }

    public String getResume() {
        return resume;
    }
}
