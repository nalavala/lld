package design_pattern.decorator.exercise.file;

public class SimpleTextPrinter implements TextPrinter {
    @Override
    public void printText(String text) {
        System.out.println(text);
    }
}
