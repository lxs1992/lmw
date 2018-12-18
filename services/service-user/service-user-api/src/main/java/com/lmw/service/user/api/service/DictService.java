package com.lmw.service.user.api.service;

import com.lmw.service.user.api.entity.dict.Area;
import com.lmw.service.user.api.entity.dict.City;
import com.lmw.service.user.api.entity.dict.Province;
import com.lmw.service.user.api.mapper.DictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictService {
    @Autowired
    private DictMapper dictMapper;

    public List<Province> getProvinceList(){
        return dictMapper.getProvinceList();
    }
    public List<City> getCityList(String privinceCode){
        return dictMapper.getCityList(privinceCode);
    }
    public List<Area> getAreaList(String cityCode){
        return dictMapper.getAreaList(cityCode);
    }

    public String getPrivinceNameByCode(String privinceCode){
        return dictMapper.getProvinceNameByCode(privinceCode);
    }
    public String getCityNameByCode(String cityCode){
        return  dictMapper.getCityNameByCode(cityCode);
    }
    public String getAreaNameByCode(String areaCode){
        return dictMapper.getAreaNameByCode(areaCode);
    }
}
