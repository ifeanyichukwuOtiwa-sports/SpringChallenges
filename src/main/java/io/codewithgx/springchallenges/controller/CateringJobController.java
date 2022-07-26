package io.codewithgx.springchallenges.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.JsonNode;

import io.codewithgx.springchallenges.enums.Status;
import io.codewithgx.springchallenges.model.CateringJob;
import io.codewithgx.springchallenges.repository.CateringJobRepository;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("cateringJobs")
public class CateringJobController {
    private static final String IMAGE_API = "https://foodish-api.herokuapp.com";
    private final CateringJobRepository cateringJobRepository;
    WebClient client;

    public CateringJobController(CateringJobRepository cateringJobRepository, WebClient.Builder webClientBuilder) {
        this.cateringJobRepository = cateringJobRepository;
    }

    @GetMapping
    @ResponseBody
    public List<CateringJob> getCateringJobs() {
        return cateringJobRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public CateringJob getCateringJobById(@PathVariable Long id) {
        if (cateringJobRepository.existsById(id)) {
            return cateringJobRepository.findById(id).get();
        } else {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }

    public List<CateringJob> getCateringJobsByStatus(Status status) {
        return null;
    }

    public CateringJob createCateringJob(CateringJob job) {
        return null;
    }

    public CateringJob updateCateringJob(CateringJob cateringJob, Long id) {
        return null;
    }

    public CateringJob patchCateringJob(Long id, JsonNode json) {
        return null;
    }

    public Mono<String> getSurpriseImage() {
        return null;
    }
}
