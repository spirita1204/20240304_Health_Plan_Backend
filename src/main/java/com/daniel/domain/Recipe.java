package com.daniel.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Recipe") // 標記這個class對映一個collection，在(Recipe)這個collection裡面操作document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Recipe {
  @Id
  private ObjectId id;
  
  /** 標題 */
  private String title;

  /** 時間 */
  private String time;

  /** 圖片base64 */
  private String imageBase64;
}
