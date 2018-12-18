package com.lmw.service.user.api.mapper;

import com.lmw.service.user.api.entity.Address;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper {
    void addAddress(Address address);
}
