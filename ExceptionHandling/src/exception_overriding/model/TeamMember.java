package exception_overriding.model;

import java.io.IOException;

public abstract class TeamMember {
    public void work() throws IOException {
        System.out.println("Team Member");
    }
}
