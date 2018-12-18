package com.lmw.service.user.api.entity;

import lombok.Data;

@Data
public class Address {
        private Integer id;
        private Integer uid;
        private String recvPerson;
        private String recvProvince;
        private String recvCity;
        private String recvArea;
        private String recvDistrict;
        private String recvAddr;
        private String recvPhone;
        private String recvTel;
        private String recvAddrCode;
        private String recvName;
        private Integer isDefault;
}
