package com.daniel.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Record")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Record {
  @Id
  private ObjectId id;

  /** 日期 */
  private String date;

  /** 選擇種類[0: 早餐, 1: 午餐, 2: 晚餐, 3: 點心] */
  private String type;

  /** 食物id */
  private String foodId;
}
