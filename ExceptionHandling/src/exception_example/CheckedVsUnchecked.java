package exception_example;

import java.io.IOException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        System.out.println("unchecked exception -> runtimeException, checked exception -> IOException");
        compileCompilesRuntimeException();
        try {
            compilerDoNotCompileIOException(); //IOException do not
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("This will not run");
    }

    private static void compilerDoNotCompileIOException() throws IOException{
        throw new IOException();
    }

    private static void compileCompilesRuntimeException() {
        throw new IllegalArgumentException();
    }
}
