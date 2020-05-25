package com.stuxnet.jobfinder.config;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stuxnet.jobfinder.domain.CandidateRegistration;
import com.stuxnet.jobfinder.marshaller.CandidateRegistrationDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DateFormat;

@Configuration
public class GenericConfiguration {

    @Bean
    public Gson gson() {
        return new GsonBuilder()
                .registerTypeAdapter(CandidateRegistration.class, new CandidateRegistrationDeserializer())
                .serializeNulls()
                .setDateFormat(DateFormat.LONG)
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
                .setPrettyPrinting()
                .setVersion(1.0)
                .create();
    }
}
