package io.codewithgx.springchallenges.services;

import org.springframework.stereotype.Component;

import io.codewithgx.springchallenges.repository.CateringJobRepository;

@Component
public class CateringJobsEndpoint {
    private final CateringJobRepository cateringJobRepository;

    public CateringJobsEndpoint(CateringJobRepository cateringJobRepository) {
        this.cateringJobRepository = cateringJobRepository;
    }
}
