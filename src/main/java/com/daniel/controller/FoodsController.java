package com.daniel.controller;

import com.daniel.dto.RecipeRs;
import com.daniel.service.FoodsService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foods")
public class FoodsController {

  @Resource
  FoodsService foodsService;

  /**
   * 取得食譜資料(批量取得)
   * 
   * @return
   */
  @GetMapping("/getRecipe")
  public RecipeRs getRecipe() {
    return foodsService.getRecipe();
  }
}
