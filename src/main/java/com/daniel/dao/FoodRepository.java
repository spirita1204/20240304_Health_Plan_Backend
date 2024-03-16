package com.daniel.dao;

import com.daniel.domain.Food;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodRepository extends MongoRepository<Food, ObjectId>{

}
