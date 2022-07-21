package host;

import repository.Broadcasts;

import java.io.Serializable;

public class InvitedHost extends Host implements Serializable {
    static final long serialVersionUID = 17643643434348L;
    private final String resume;

    public static InvitedHost createHost(String name, Broadcasts broadcasts, String resume) {
        if (broadcasts == null || name == null || resume == null)
            throw new IllegalArgumentException("No null parameters allowed");

        return new InvitedHost(name, broadcasts, resume);
    }

    private InvitedHost(String name, Broadcasts broadcasts, String resume) {
        super(name, broadcasts);
        this.resume = resume;
    }

    public String getResume() {
        return resume;
    }
}
