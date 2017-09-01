package com.example.android.reportcard;

public class ReportCard {

    private int mathGrade;
    private int englishGrade;
    private int historyGrade;
    private int chemistryGrade;
    private String student;

    /**
     *
     * @param mMathGrade
     * @param mEnglishGrade
     * @param mHistoryGrade
     * @param mChemistryGrade
     */
    public ReportCard(String mStudent, int mMathGrade, int mEnglishGrade, int mHistoryGrade, int mChemistryGrade) {
        student = mStudent;
        mathGrade = mMathGrade;
        englishGrade = mEnglishGrade;
        historyGrade = mHistoryGrade;
        chemistryGrade = mChemistryGrade;
    }

    @Override
    public String toString() {
        return "Name: " + student + ", Math: " + mathGrade + ", English: " + englishGrade +
                ", History: " + historyGrade + ", Chemistry: " + chemistryGrade;
    }


    public int getMathGrade() {
        return mathGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setMathGrade(int grade) {
        mathGrade = grade;
    }

    public void setEnglishGrade(int grade) {
        englishGrade = grade;
    }

    public void setHistoryGrade(int grade) {
        historyGrade = grade;
    }

    public void setChemistryGrade(int grade) {
        chemistryGrade = grade;
    }
}
