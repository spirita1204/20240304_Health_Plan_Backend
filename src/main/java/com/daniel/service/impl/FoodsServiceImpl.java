package com.daniel.service.impl;

import com.daniel.dto.RecipeRs;
import com.daniel.dto.RecipeRs.RecipeInfo;
import com.daniel.service.FoodsService;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoodsServiceImpl implements FoodsService {

  @Override
  public RecipeRs getRecipe() {
    List<RecipeInfo> recipeInfos = Arrays.asList(
        new RecipeInfo("炒毛豆金槍魚和杏鮑菇", "35", ""),
        new RecipeInfo("自製花生醬餅乾", "40", ""), 
        new RecipeInfo("高麗菜餅", "25", ""),
        new RecipeInfo("法國麵包", "50", ""),
        new RecipeInfo("全麥麵包", "55", ""),
        new RecipeInfo("香蕉燕麥巧克力蛋糕", "40", ""),
        new RecipeInfo("香蕉可可蛋糕", "40", ""),
        new RecipeInfo("低熱量煎餅", "20", ""),
        new RecipeInfo("豆腐布朗尼", "45", ""),
        new RecipeInfo("減糖戚風蛋糕", "35", ""),
        new RecipeInfo("蛋餅", "30", ""),
        new RecipeInfo("蛋黃餅", "25", ""),
        new RecipeInfo("葡萄干麵包配核桃", "65", ""),
        new RecipeInfo("香蕉燕麥布朗尼", "40", ""),
        new RecipeInfo("燕麥香蕉餅乾", "30", ""),
        new RecipeInfo("番茄金針菇蛋花湯", "35", ""),
        new RecipeInfo("香蕉燕麥布朗尼", "50", ""),
        new RecipeInfo("香蕉芝麻豆漿燕麥", "10", "")
    );
    return new RecipeRs(recipeInfos);
  }

}
