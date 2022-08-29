package design_pattern.decorator.exercise.file;

public class EncryptedTextPrinter implements TextPrinter {

    public TextPrinter printer;

    public EncryptedTextPrinter(TextPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void printText(String text) {
        printer.printText(text + "encrypted");
    }
}
