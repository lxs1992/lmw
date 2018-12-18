package com.lmw.service.user.api.controller;

import com.lmw.service.user.api.entity.ResponseResult;
import com.lmw.service.user.api.entity.dict.Area;
import com.lmw.service.user.api.entity.dict.City;
import com.lmw.service.user.api.entity.dict.Province;
import com.lmw.service.user.api.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dict")
public class DictController {
    @Autowired
    private DictService dictService;

    @RequestMapping("get_province_list")
    public ResponseResult<List<Province>> getProvinceList(){
        List<Province> data = dictService.getProvinceList();
        ResponseResult<List<Province>> responseResult = new ResponseResult<>();
        responseResult.setState(ResponseResult.STATE_OK);
        responseResult.setData(data);
        return responseResult;
    }

    @RequestMapping("get_city_list")
    public ResponseResult<List<City>> getCityList(String provinceCode){
        List<City> data = dictService.getCityList(provinceCode);
        ResponseResult<List<City>> responseResult = new ResponseResult<>();
        responseResult.setState(ResponseResult.STATE_OK);
        responseResult.setData(data);
        return responseResult;
    }

    @RequestMapping("get_area_list")
   public ResponseResult<List<Area>> getAreaList(String cityCode){
        List<Area> data = dictService.getAreaList(cityCode);
        ResponseResult<List<Area>> responseResult = new ResponseResult<>();
        responseResult.setState(ResponseResult.STATE_OK);
        responseResult.setData(data);
        return responseResult;
    }
}
