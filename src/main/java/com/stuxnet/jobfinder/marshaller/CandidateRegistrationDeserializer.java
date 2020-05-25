package com.stuxnet.jobfinder.marshaller;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stuxnet.jobfinder.constant.ConditionsAcceptable;
import com.stuxnet.jobfinder.constant.EducationLevel;
import com.stuxnet.jobfinder.constant.EmploymentType;
import com.stuxnet.jobfinder.constant.WorkEligibility;
import com.stuxnet.jobfinder.domain.CandidateRegistration;
import com.stuxnet.jobfinder.domain.CompleteName;
import com.stuxnet.jobfinder.exception.JobFinderException;

import java.io.IOException;

public class CandidateRegistrationDeserializer extends TypeAdapter<CandidateRegistration> {

    @Override
    public void write(JsonWriter jsonWriter, CandidateRegistration candidateRegistration) throws IOException {
        throw new JobFinderException("This domain object is not exposed for Serialization");
    }

    @Override
    public CandidateRegistration read(JsonReader jsonReader) throws IOException {
        CandidateRegistration candidateRegistration = new CandidateRegistration();

        jsonReader.beginObject();

        while(jsonReader.hasNext()) {
            String fieldName = jsonReader.nextName();

            switch (fieldName) {
                case "currentCompensation": {
                    candidateRegistration.setCurrentCompensation(jsonReader.nextLong());
                    break;
                }

                case "terms": {
                    candidateRegistration.setTerms(ConditionsAcceptable.valueOf(jsonReader.nextString()));
                    break;
                }

                case "employmentType": {
                    candidateRegistration.setEmploymentType(EmploymentType.valueOf(jsonReader.nextString()));
                    break;
                }

                case "name": {
                    jsonReader.beginObject();
                    CompleteName nm = new CompleteName();

                    while(jsonReader.hasNext()) {
                        switch (jsonReader.nextName()) {
                            case "firstName": {
                                nm.setFirstName(jsonReader.nextString());
                                break;
                            }

                            case "lastName": {
                                nm.setLastName(jsonReader.nextString());
                                break;
                            }
                        }
                    }

                    candidateRegistration.setName(nm);
                    jsonReader.endObject();

                    break;
                }

                case "emailAddress": {
                    candidateRegistration.setEmailAddress(jsonReader.nextString());
                    break;
                }

                case "password": {
                    candidateRegistration.setPassword(jsonReader.nextString());
                    break;
                }

                case "workEligibility": {
                    candidateRegistration.setWorkEligibility(WorkEligibility.valueOf(jsonReader.nextString()));
                    break;
                }

                case "education": {
                    candidateRegistration.setEducation(EducationLevel.valueOf(jsonReader.nextString()));
                    break;
                }
            }
        }

        jsonReader.endObject();
        return candidateRegistration;
    }
}
