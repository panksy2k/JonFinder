package com.stuxnet.jobfinder.domain;

import com.stuxnet.jobfinder.constant.ConditionsAcceptable;
import com.stuxnet.jobfinder.constant.EducationLevel;
import com.stuxnet.jobfinder.constant.EmploymentType;
import com.stuxnet.jobfinder.constant.WorkEligibility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
@ApiModel(value = "This model is used to bind candidate registration values")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CandidateRegistration implements Serializable {

    @ApiModelProperty(notes = "The complete name of the candidate") CompleteName name;
    @ApiModelProperty(notes = "The email address of the candidate") String emailAddress;
    @ApiModelProperty(notes = "Denotes the work eligibility") WorkEligibility workEligibility;
    @ApiModelProperty(notes = "Denotes the education level") EducationLevel education;
    @ApiModelProperty(notes = "What password would he like to give for login") char[] password;
    @ApiModelProperty(notes = "Status of current employment") EmploymentType employmentType;
    @ApiModelProperty(notes = "Current compensation") long currentCompensation;
    @ApiModelProperty(notes = "Accept the terms") ConditionsAcceptable terms;
}
