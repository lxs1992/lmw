package com.lmw.service.user.api.entity;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class ResponseResult<T> {
    public static final int STATE_OK = 1;
    public static final int STATE_ERROR = -1;

    private int state;
    private String message;
    private T data;
}
