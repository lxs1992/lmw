package com.lmw.service.user.api.entity.dict;

import lombok.Data;

@Data
public class City {
    private Integer id;
    private String provinceCode;
    private String cityCode;
    private String cityName;
}
