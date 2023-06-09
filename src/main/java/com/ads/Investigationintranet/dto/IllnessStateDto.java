package com.ads.Investigationintranet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IllnessStateDto {
  private Long id;
  private String name;
  private boolean checked;

  public IllnessStateDto(Long id,String name) {
    this.id=id;
    this.name=name;
  }
}
