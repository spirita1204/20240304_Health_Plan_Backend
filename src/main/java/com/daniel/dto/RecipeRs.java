package com.daniel.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class RecipeRs {
  /** 食譜資料 */
  private List<RecipeInfo> recipeInfos;
  
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public static class RecipeInfo {
    /** 標題 */
    private String title;
      
    /** 時間 */
    private String time;
    
    /** 照片 */
    private String imageBase64;
  }
}
 