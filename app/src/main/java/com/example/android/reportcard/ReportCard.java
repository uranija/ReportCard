package com.example.android.reportcard;



/**
 * {@link ReportCard} represents a report card of the student.
 * It contains students name, biology grade, chemistry grade, algebra grade, geometry grade, japanese grade, and philosophy grade in report card class.
 */
public class ReportCard {

    /**students name for the report card*/
    private String mStudentName;
    /**biology grade for the report card*/
    private int mBiologyGrade;
    /**chemistry grade for the report card*/
    private int mChemistryGrade;
    /**algebra grade for the report card*/
    private int mAlgebraGrade;
    /**geometry grade for the report card*/
    private int mGeometryGrade;
    /**japanese grade for the report card*/
    private int mJapaneseGrade;
    /**philosophy grade for the report card*/
    private int mPhilosophyGrade;
    /** Constant value that represents duration of one semester at school for the report card */
    private static final int DURATION_OF_SEMESTER = 90;


    /**
     * Create a new ReportCard object.
     *
     * @param  StudentName represents the person who's grade is in report card
     * @param  BiologyGrade represents biology grade
     * @param AlgebraGrade represents algebra grade
     * @param GeometryGrade represents geometry grade
     * @param ChemistryGrade represents chemistry grade
     * @param JapaneseGrade represents japanese grade
     * @param PhilosophyGrade represents philosophy grade
     */

    public ReportCard(String StudentName, int BiologyGrade, int AlgebraGrade, int GeometryGrade, int ChemistryGrade, int JapaneseGrade,
                      int PhilosophyGrade)


    {

        mStudentName = StudentName;
        mBiologyGrade = BiologyGrade;
        mAlgebraGrade = AlgebraGrade;
        mGeometryGrade = GeometryGrade;
        mChemistryGrade = ChemistryGrade;
        mJapaneseGrade = JapaneseGrade;
        mPhilosophyGrade = PhilosophyGrade;


    }

    /**
     *   Set the student name in the report card.
     */

    public void setmStudentName(String StudentName) {
        mStudentName = StudentName;
    }
    /**
     *   Get the student name in the report card.
     */
    public String getmStudentName() {
        return mStudentName;

    }
    /**
     *   Set the chemistry grade in the report card.
     */

    public void setChemistryGrade(int Chemistrygrade) {
        mChemistryGrade = Chemistrygrade;
    }
    /**
     *  Get the chemistry grade in the report card.
     */
    public int getmChemistryGrade() {
        return mChemistryGrade;

    }
    /**
     *   Set the biology grade in the report card.
     */

    public void setmBiologyGrade(int BiologyGrade) {
        mBiologyGrade = BiologyGrade;
    }
    /**
     *   Get the biology grade in the report card.
     */
    public int getmBiologyGrade() {
        return mBiologyGrade;

    }
           /**
          *Set the algebra grade in the report card.
            */

    public void setmAlgebraGrade(int AlgebraGrade) {
        mAlgebraGrade = AlgebraGrade;
    }
    /**
     *Get the algebra grade in the report card.
     */

    public int getmAlgebraGrade() {
        return mAlgebraGrade;

    }
    /**
     *Set the geometry grade in the report card.
     */
    public void setmGeometryGrade(int GeometryGrade) {
        mGeometryGrade = GeometryGrade;
    }
    /**
     *Get the geometry grade in the report card.
     */
    public int getmGeometryGrade() {
        return mGeometryGrade;

    }
    /**
     *Setthe japanese grade in the report card.
     */

    public void setmJapaneseGrade(int JapaneseGrade) {
        mJapaneseGrade = JapaneseGrade;
    }
    /**
     *Get the japanese grade in the report card.
     */
    public int getmJapaneseGrade() {
        return mJapaneseGrade;

    }
    /**
     *Set the philosophy grade in the report card.
     */
    public void setmPhilosophyGrade(int PhilosophyGrade) {
        mPhilosophyGrade = PhilosophyGrade;
    }
    /**
     *Get the philosophy grade in the report card.
     */
    public int getmPhilosophyGrade() {
        return mPhilosophyGrade;

    }

    /**toString() method returns the contents of the class in a ring*/

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudentName='" + mStudentName + '\'' +
                ", mBiologyGrade=" + mBiologyGrade +
                ", mChemistryGrade=" + mChemistryGrade +
                ", mAlgebraGrade=" + mAlgebraGrade +
                ", mGeometryGrade=" + mGeometryGrade +
                ", mJapaneseGrade=" + mJapaneseGrade +
                ", mPhilosophyGrade=" + mPhilosophyGrade +
                '}';
    }
}
