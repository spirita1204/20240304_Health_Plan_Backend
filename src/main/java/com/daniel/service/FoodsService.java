package com.daniel.service;

import com.daniel.dto.RecipeRs;
import com.daniel.dto.SaveFoodsRq;
import com.daniel.dto.SearchFoodsRs;

public interface FoodsService {
  /**
   * 取得食譜資料(批量取得)
   * @return
   */
  RecipeRs getRecipe();
  
  /**
   * 搜尋取得食物資料
   * 
   * @param searchText
   * @return
   */
  SearchFoodsRs searchFood(String searchText);
  
  /**
   * 用於儲存食物資料
   * 
   * @param saveFoodsRq
   * @return
   */
  boolean saveFoods(SaveFoodsRq saveFoodsRq);
}
