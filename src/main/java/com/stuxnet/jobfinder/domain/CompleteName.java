package com.stuxnet.jobfinder.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompleteName {
    String firstName;
    String lastName;
}
