package design_pattern.decorator.exercise.file;

public class Client {

    public static void main(String[] args) {
        TextPrinter textPrinter = new EncodedTextPrinter(new EncryptedTextPrinter(new SimpleTextPrinter()));
        textPrinter.printText("hello");
    }
}
