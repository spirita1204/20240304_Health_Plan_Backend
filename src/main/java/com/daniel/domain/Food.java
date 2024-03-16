package com.daniel.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Foods") // 標記這個class對映一個collection，在(Recipe)這個collection裡面操作document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Food {
  @Id
  private ObjectId id;
  
  /** 食物標題 */
  private String foodName;

  /** 熱量 */
  private Integer kcal;

  /** 量 */
  private Integer volume;
  
  /** 單位 */ 
  private String unit;
  
}
