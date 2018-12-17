package bean;

import com.alibaba.fastjson.JSON;
import utils.MeaasgeUtil;
import utils.ResultMsgConstant;


public class ResultJson {
    private MeaasgeUtil me = new MeaasgeUtil();

    private Integer code = 0;
    private Object body = me.getValue(ResultMsgConstant.querySuccess);
    private String msg = "成功";
    private Long count = null;

    public ResultJson() {
        this.code = getCode();
        this.body = getBody();
        this.msg = getMsg();
    }

    public ResultJson(Integer code, Object body, String msg, Long count) {
        this.code = code;
        this.body = body;
        this.msg = msg;
        this.count = count;
    }

    public ResultJson(Integer code, Object body, String msg) {
        this.code = code;
        this.body = body;
        this.msg = msg;
    }

    public ResultJson(Integer code, Object body, Long count) {
        this.code = code;
        this.body = body;
        this.count = count;
    }

    public ResultJson(Integer code, Object body) {
        this.code = code;
        this.body = body;
    }

    public ResultJson(Object body, String msg, Object count) {
        this.body = body;
        this.msg = msg;
        this.count = Long.parseLong(count.toString());
    }

    public ResultJson(Object body, String msg) {
        this.body = body;
        this.msg = msg;
    }

    public ResultJson(Object body, Long count) {
        this.body = body;
        this.count = count;
    }

    public ResultJson(Object body, Integer count) {
        this.body = body;
        this.count = Long.parseLong(count.toString());
    }

    public ResultJson(Object body) {
        this.body = body;
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
