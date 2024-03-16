package com.daniel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveFoodsRq {
  @JsonProperty("DATE")
  String date;
  
  @JsonProperty("TYPE")
  String type;
  
  @JsonProperty("ITEMS")
  List<String> foods;
}
