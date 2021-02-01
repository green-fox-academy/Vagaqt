package com.example.demo.service;

import com.example.demo.model.ErrorMessage;
import com.example.demo.model.ExampleLink;
import com.example.demo.repo.ExampleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ExampleService {
    private ExampleRepo exampleRepo;

    @Autowired
    public ExampleService(ExampleRepo exampleRepo) {
        this.exampleRepo = exampleRepo;
    }

    public ErrorMessage error(String message) {
        return new ErrorMessage(message);
    }

    public void createLink(ExampleLink exampleLink) {
        Random random = new Random();
        exampleLink.setSecretCode(String.format("%04d", random.nextInt(10000)));
        exampleRepo.save(exampleLink);
    }

    public List<ExampleLink> getAllLinks() {
        return (List<ExampleLink>) exampleRepo.findAll();
    }

    public void deleteLink(Long id) {
        exampleRepo.deleteById(id);
    }

    public ExampleLink findByAlias(String alias) {
        Optional<ExampleLink> optionalExampleLink =
                getAllLinks()
                        .stream()
                        .findFirst()
                        .filter(exampleLink -> exampleLink.getAlias().equals(alias));
        if (!optionalExampleLink.isPresent()) {
            throw new IllegalArgumentException();
        }
        ExampleLink exampleLink = optionalExampleLink.get();
        exampleRepo.save(exampleLink);
        return exampleLink;
    }
}

