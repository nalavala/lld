package design_pattern.builder.v3;

public class Client {

    public static void main(String[] args) {
        UserExam userExam = UserExam.getBuilder().setEnglishMarks(2)
                .setHindiMarks(4)
                .setMathMarks(65)
                .builder();

        userExam.getEnglishMarks();
        /*
        this code readable and understandable
         */
    }
}
