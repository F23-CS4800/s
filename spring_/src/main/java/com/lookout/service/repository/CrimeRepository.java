package com.lookout.service.repository;

import com.lookout.service.models.Crime;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CrimeRepository extends MongoRepository<Crime, String> {
    // define custom query methods here if needed
}

