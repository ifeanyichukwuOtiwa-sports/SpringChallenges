package io.codewithgx.springchallenges.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.codewithgx.springchallenges.model.CateringJob;

public interface CateringJobRepository extends CrudRepository<CateringJob, Long> {
    List<CateringJob> findAll();
}
