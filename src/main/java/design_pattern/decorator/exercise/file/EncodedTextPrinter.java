package design_pattern.decorator.exercise.file;

public class EncodedTextPrinter implements TextPrinter {

    private TextPrinter printer;

    public EncodedTextPrinter(TextPrinter printer) {
        this.printer = printer;
    }
    @Override
    public void printText(String text) {
        printer.printText(text + "encoded");
    }
}
