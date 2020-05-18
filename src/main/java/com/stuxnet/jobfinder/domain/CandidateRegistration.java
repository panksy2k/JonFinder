package com.stuxnet.jobfinder.domain;

import com.stuxnet.jobfinder.constant.ConditionsAcceptable;
import com.stuxnet.jobfinder.constant.EducationLevel;
import com.stuxnet.jobfinder.constant.EmploymentType;
import com.stuxnet.jobfinder.constant.WorkEligibility;

import java.io.Serializable;

public class CandidateRegistration implements Serializable {
    CompleteName name;
    String emailAddress;
    WorkEligibility workEligibility;
    EducationLevel education;
    char[] password;
    EmploymentType employmentType;
    long currentCompensation;
    ConditionsAcceptable terms;
}
