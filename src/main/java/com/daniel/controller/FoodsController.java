package com.daniel.controller;

import com.daniel.dto.RecipeRs;
import com.daniel.dto.SaveFoodsRq;
import com.daniel.dto.SearchFoodsRs;
import com.daniel.service.FoodsService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foods")
public class FoodsController {

  @Resource
  FoodsService foodsService;

  /**
   * 取得食譜資料(批量取得) TODO
   * 
   * @return
   */
  @GetMapping("/getRecipe")
  public RecipeRs getRecipe() {
    return foodsService.getRecipe();
  }

  /**
   * 搜尋取得食物資料
   * 
   * @return
   */
  @PostMapping("/searchFood")
  public SearchFoodsRs searchFood(String searchText) {
    return foodsService.searchFood(searchText);
  }


  /**
   * 用於儲存食物資料
   * 
   * @return
   */
  @PostMapping("/saveFoods")
  public boolean saveFoods(@RequestBody SaveFoodsRq saveFoodsRq) {
    return foodsService.saveFoods(saveFoodsRq);
  }
}
