package HomeWork7;

import java.io.FileNotFoundException;


public class Program {
    public static void main(String[] args) throws FileNotFoundException {

        Presenter presenter = new Presenter(new Calculator());
        presenter.start();
    }
}