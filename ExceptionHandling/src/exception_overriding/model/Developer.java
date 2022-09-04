package exception_overriding.model;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Developer extends TeamMember{
    @Override
    public void work() throws FileNotFoundException, IOException { //Exception can not be thrown, as Exception is higher level exception, that means some other exceptions not covered
        System.out.println("Developer");
    }
}
