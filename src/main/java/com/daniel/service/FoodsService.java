package com.daniel.service;

import com.daniel.dto.RecipeRs;

public interface FoodsService {
  /**
   * 取得食譜資料(批量取得)
   * @return
   */
  RecipeRs getRecipe();
}
