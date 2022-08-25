package design_pattern.builder.v2;

public class Client {

    public static void main(String[] args) {
        UserExamParam params = new UserExamParam();
        params.mathMarks = 3;
        params.scienceMarks =5;
        UserExam userExam =  new UserExam(params);
        /*
        this code readable and understandable
         */
    }
}
