package com.accenture.tagtrainingspring.screening;
import lombok.Data;

@Data
public class Screening {
    public Screening() {};
    /* 
    private String Name;
    private Integer ScreeningId;
    private Patient Patient;
    private LocalDate DateOfScreening;
    private Boolean Malignant;
    */

    private int Id;
    private char Diagnosis;
    private Double RadiusMean;
    private Double TextureMean;
    private Double PerimeterMean;
    private Double AreaMean;
    private Double SmoothnessMean;
    private Double CompactnessMean;
    private Double ConcavityMean;
    private Double ConcavePointsMean;
    private Double SymmetryMean;
    private Double FractalDimensionMean;
    private Double TextureSe;
    private Double PerimeterSe;
    private Double AreaSe;
    private Double SmoothnessSe;
    private Double CompactnessSe;
    private Double ConcavitySe;
    private Double ConcavePointsSe;
    private Double SymmetrySe;
    private Double FractalDimensionSe;
    private Double RadiusWorst;
    private Double TextureWorst;
    private Double PerimeterWorst;
    private Double AreaWorst;
    private Double SmoothnessWorst;
    private Double CompactnessWorst;
    private Double ConcavityWorst;
    private Double ConcavePointsWorst;
    private Double SymmetryWorst;
    private Double FractalDimensionWorst;
    private char GroupId;
}