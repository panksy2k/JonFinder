package com.stuxnet.jobfinder.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@ApiModel
@NoArgsConstructor
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompleteName {
    @ApiModelProperty(notes = "The first name of the candidate") String firstName;
    @ApiModelProperty(notes = "The last name of the candidate") String lastName;
}
