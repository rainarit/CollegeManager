/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Sandeep
 */
public class Useer {
    public String UnweightedGPA;
    public String WeightedGPA;
    public String SATScore;
    public String StudentID;
    public String TOEFLScore;
    public String IBScore;
    public String UniversityName;
    public String GPA;
    public String UniversitySATScore;
    public double Fees;
    public String UniversityGPA;
    public String Field;
    
    /**
     *@param StudentID
     * @param WeightedGPA
     * @param WeightedGPA
     * @param SATScore
     */
    public Useer(String UnweightedGPA, String WeightedGPA, String SATScore, String StudentID, String TOEFLScore, String IBScore)
    {
        this.UnweightedGPA = UnweightedGPA;
        this.WeightedGPA = WeightedGPA;
        this.SATScore = SATScore;
        this.StudentID = StudentID;
        this.TOEFLScore = TOEFLScore;
        this.IBScore = IBScore;
    }

    public Useer(String UniversityName, String GPA, String UniversitySATScore, double Fees, String Field)
    {
        this.UniversityName = UniversityName;
        this.GPA = GPA;
        this.UniversitySATScore = UniversitySATScore;
        this.Fees = Fees;
        this.Field = Field;
    }
    public String getWeightedGPA()
    {
        return WeightedGPA;
    }
    public String getUnweightedGPA()
    {
        return UnweightedGPA;
    }
    public String getSATScore()
    {
        return SATScore;
    }
    public String getStudentID()
    {
        return StudentID;
    }
    public String getTOEFLScore()
    {
        return TOEFLScore;
    }
    public String getIBScore()
    {
        return IBScore;
    }
    public String getUniversityName()
    {
        return UniversityName;
    }
    public String getGPA()
    {
        return GPA;
    }
    public String getUniversitySATScore()
    {
        return UniversitySATScore;
    }
    public double getFees()
    {
        return Fees;
    }
    public String getField()
    {
        return Field;
    }
 
}
