package com.ads.Investigationintranet.dto;

import com.ads.Investigationintranet.entity.Organ;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganDto {
    private long id;
    private String name;
    private boolean checked;

    public OrganDto(Long id,String name) {
        this.id=id;
        this.name=name;
    }


}


