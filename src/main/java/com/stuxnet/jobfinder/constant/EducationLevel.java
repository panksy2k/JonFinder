package com.stuxnet.jobfinder.constant;

public enum EducationLevel {
    A_LEVEL("A levels"),
    BTEC("BTEC"),
    CITYGUILDS("City and Guilds"),
    DIPLOMA("Diploma"),
    GCSE("GCSE/O Levels/GNVQ"),
    MASTERS("Masters Degree"),
    PHD("PhD"),
    UNIDEGREE("University Degree");


    private final String description;
    EducationLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
