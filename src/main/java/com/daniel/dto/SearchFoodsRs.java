package com.daniel.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class SearchFoodsRs {
  /** 搜尋取得食物資料 */
  private List<SearchFood> searchFoods;
  
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public static class SearchFood {
    /** 食物id */
    private String id;
    
    /** 食物標題 */
    private String foodName;

    /** 熱量 */
    private Integer kcal;

    /** 量 */
    private Integer volume;
    
    /** 單位 */ 
    private String unit;
  }
}
