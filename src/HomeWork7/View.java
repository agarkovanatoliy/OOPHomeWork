package HomeWork7;


import java.util.Scanner;

public class View {

    Scanner scanner = new Scanner(System.in);
    Calculator calculator;
    Loger loger;

    public View(Calculator calculator, Loger loger) {
        this.calculator = calculator;
        this.loger = loger;
    }

    public void viewComplexNumber(Double[] complex) {
        String result = complex[0].toString();
        if (complex[1] < 0) result += " - " + complex[1] * -1 + "i";
        else if (complex[1] > 0) result += " + " + complex[1] + "i";
        System.out.println(result);
    }

    public void print(String message) {
        System.out.println(message);
    }

    public String get() {
        return scanner.nextLine();
    }

    public String getChoice(){
        String data = scanner.nextLine();
        String[] pieces = data.split("\\s+");
        return pieces[0];
    }

    public String complexToString(Double[] res) {
        String sb = "";
        if (res[1] < 0)
            sb += "(" + res[0] + " - " + res[1] * -1 + "i)";
        else if (res[1] > 0)
            sb += "(" + res[0] + " + " + res[1] + "i)";
        else
            sb += res[0];

        return sb;
    }
}