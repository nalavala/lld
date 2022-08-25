package design_pattern.builder.v3;

import design_pattern.builder.v2.UserExamParam;

public class UserExam {

    private int mathMarks;
    private int scienceMarks;
    private int socialMarks;
    private int englishMarks;
    private int hindiMarks;

    private UserExam() {
        // to void directly creating object
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public int getSocialMarks() {
        return socialMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int mathMarks;
        private int scienceMarks;
        private int socialMarks;
        private int englishMarks;
        private int hindiMarks;

        public Builder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }

        public Builder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public Builder setSocialMarks(int socialMarks) {
            this.socialMarks = socialMarks;
            return this;
        }

        public Builder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public Builder setHindiMarks(int hindiMarks) {
            this.hindiMarks = hindiMarks;
            return this;
        }


        public UserExam builder() {
            // validations

            UserExam userExam = new UserExam();
            userExam.englishMarks = englishMarks;
            userExam.hindiMarks = hindiMarks;
            userExam.scienceMarks = scienceMarks;
            userExam.mathMarks = mathMarks;
            userExam.socialMarks = socialMarks;
            return userExam;
        }
    }
}
