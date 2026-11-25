
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {
    public void print() {
        System.out.println("Printing document");
    }
}

class MultiFunctionPrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class ISPExample {
    public static void main(String[] args) {

        BasicPrinter printer = new BasicPrinter();
        MultiFunctionPrinter machine = new MultiFunctionPrinter();

        printer.print();

        machine.print();
        machine.scan();
    }
}
