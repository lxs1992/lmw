package com.lmw.service.user.api.mapper;

import com.lmw.service.user.api.entity.dict.Area;
import com.lmw.service.user.api.entity.dict.City;
import com.lmw.service.user.api.entity.dict.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DictMapper {
    List<Province> getProvinceList();
    List<City> getCityList(String provinceCode);
    List<Area> getAreaList(String cityCode);

    String getProvinceNameByCode(String provinceCode);
    String getCityNameByCode(String cityCode);
    String getAreaNameByCode(String areaCode);
}
