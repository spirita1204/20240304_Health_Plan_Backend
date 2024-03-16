package com.daniel.dao;

import com.daniel.domain.Record;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordRepository extends MongoRepository<Record, ObjectId>{

}
