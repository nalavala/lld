package design_pattern.builder.v1;

public class UserExam {

    private int mathMarks;
    private int scienceMarks;
    private int socialMarks;
    private int englishMarks;
    private int hindiMarks;

    public UserExam(int mathMarks, int scienceMarks, int socialMarks, int englishMarks, int hindiMarks) {
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.socialMarks = socialMarks;
        this.englishMarks = englishMarks;
        this.hindiMarks = hindiMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getSocialMarks() {
        return socialMarks;
    }

    public void setSocialMarks(int socialMarks) {
        this.socialMarks = socialMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public void setHindiMarks(int hindiMarks) {
        this.hindiMarks = hindiMarks;
    }
}
