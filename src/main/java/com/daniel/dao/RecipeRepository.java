package com.daniel.dao;

import com.daniel.domain.Recipe;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, ObjectId>{
 
}
