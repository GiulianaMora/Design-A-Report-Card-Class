public class ReportCard {

    private String mName;
    private int mYear;
    private int mMath;
    private int mHistory;
    private int mLanguage;
    private int mScience;
    private int mFitness;
    private int mElective;

    public ReportCard(String name, int year, int history, int math,
                      int language, int science, int fitness, int elective) {
        mName = name;
        mYear = year;
        mHistory = history;
        mMath = math;
        mLanguage = language;
        mScience = science;
        mFitness = fitness;
        mElective = elective;
    }

    // Get name of Student
    public String getName() {
        return mName;
    }

    // Set Name of Student
    public void setName(String name) {
        mName = name;
    }

    // Get class year of student
    public int getYear() {
        return mYear;
    }

    // Set class year of student
    public void setYear(int year) {
        mYear = year;
    }

    // Get history grade
    public int getHistoryGrade() {
        return mHistory;
    }

    // Set history grade
    public void setHistoryMarks(int history) {
        mHistory = history;
    }

    // Get math grade
    public int getMathGrade() {
        return mMath;
    }

    // Set math grade
    public void setMathGrade(int math) {
        mMath = math;
    }

    // Get language grade
    public int getLanguageGrade() {
        return mLanguage;
    }

    // Set language grade
    public void setLanguageGrade(int language) {
        mLanguage = language;
    }

    // Get science grade
    public int getScienceGrade() {
        return mScience;
    }

    // Set science grade
    public void setScienceGrade(int science) {
        mScience = science;
    }

    // Get fitness grade
    public int getFitnessGrade() {
        return mFitness;
    }

    // Set fitness grade
    public void setFitnessGrade(int fitness) {
        mFitness = fitness;
    }

    // Get elective grade
    public int getElectiveGrade() {
        return mElective;
    }

    // Set elective grade
    public void setElectiveGrade(int elective) {
        mElective = elective;
    }

    @Override
    public String toString() {
        return "Name: " + mName +
                "\nYear: " + mYear +
                "\nHistory = " + mHistory +
                "\nMath = " + mMath +
                "\nLanguage = " + mLanguage +
                "\nScience = " + mScience +
                "\nFitness = " + mFitness +
                "\nElective = " + mElective;
    }
}

