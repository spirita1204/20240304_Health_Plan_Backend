package com.daniel.service.impl;

import com.daniel.dao.RecipeRepository;
import com.daniel.dto.RecipeRs;
import com.daniel.dto.RecipeRs.RecipeInfo;
import com.daniel.service.FoodsService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodsServiceImpl implements FoodsService {

  @Autowired
  RecipeRepository recipeRepository;

  @Override
  public RecipeRs getRecipe() {
    List<RecipeInfo> recipeInfos = recipeRepository.findAll().stream()
        .map(e -> new RecipeInfo(e.getTitle(), e.getTime(), e.getImageBase64())).collect(Collectors.toList());
    
    return new RecipeRs(recipeInfos);
  }

}
