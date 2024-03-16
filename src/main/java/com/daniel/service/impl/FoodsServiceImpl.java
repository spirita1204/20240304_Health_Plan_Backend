package com.daniel.service.impl;

import com.daniel.dao.FoodRepository;
import com.daniel.dao.RecipeRepository;
import com.daniel.dao.RecordRepository;
import com.daniel.dto.RecipeRs;
import com.daniel.dto.RecipeRs.RecipeInfo;
import com.daniel.dto.SaveFoodsRq;
import com.daniel.dto.SearchFoodsRs;
import com.daniel.dto.SearchFoodsRs.SearchFood;
import com.daniel.service.FoodsService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodsServiceImpl implements FoodsService {

  @Autowired
  RecipeRepository recipeRepository;

  @Autowired
  FoodRepository foodRepository;

  @Autowired
  RecordRepository recordRepository;

  @Override
  public RecipeRs getRecipe() {
    List<RecipeInfo> recipeInfos = recipeRepository.findAll().stream()
        .map(e -> new RecipeInfo(e.getTitle(), e.getTime(), e.getImageBase64())).collect(Collectors.toList());

    return new RecipeRs(recipeInfos);
  }

  @Override
  public SearchFoodsRs searchFood(String searchText) {
    List<SearchFood> searchFoods = foodRepository.findAll().stream()
        .map(e -> new SearchFood(e.getId().toString(), e.getFoodName(), e.getKcal(), e.getVolume(), e.getUnit()))
        .collect(Collectors.toList());

    return new SearchFoodsRs(searchFoods);
  }

  @Override
  public boolean saveFoods(SaveFoodsRq saveFoodsRq) {
//    List<String> foods = saveFoodsRq.getFoods();
//    String date = saveFoodsRq.getDate();
//    String type = saveFoodsRq.getType();
//    
//    try {
//      foods.forEach(e -> {
//        Record record = new Record();
//        record.setDate(date);
//        record.setType(type);
//        record.setFoodId(e);
//
//        recordRepository.save(record);
//      });
//    } catch (Exception e) {
//      return false;
//    }
    return true;
  }

}
