package com.studing;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        App app = new App();
        app.path();
    }

    private void path() throws IOException {
        System.out.println(new File("").getCanonicalPath());
        System.out.println("--------------------------");
        System.out.println(new File("").getAbsolutePath());
    }
}
