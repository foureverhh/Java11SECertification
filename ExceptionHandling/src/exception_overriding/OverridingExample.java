package exception_overriding;

import exception_overriding.model.Developer;
import exception_overriding.model.TeamMember;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingExample {
    public static void main(String[] args) {
       Developer developer = new Developer();
        try {
            developer.work();
        } catch (IOException e) {
            e.printStackTrace();
        }
        TeamMember teamMember = new Developer();

        try {
            teamMember.work();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
