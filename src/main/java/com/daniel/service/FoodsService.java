package com.daniel.service;

import com.daniel.dto.RecipeRs;
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
}
