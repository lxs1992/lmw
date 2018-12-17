package utils;

import bean.ResultJson;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;

/**
 * System exception
 * @author liumengwei
 * @Time 2017/8/2
 *
 */
public enum SystemException {
    SYSTEM_EXCEPTION(500, "System exception");

    SystemException(Integer value, String description) {
        this.value = value;
        this.description = description;
    }
    private Integer value;
    private String description;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static String setResult(ResultJson resultStruct, Exception e, Logger logger) {
        e.printStackTrace();
        logger.error(e.getMessage(), e);
        resultStruct.setBody("");
        resultStruct.setMsg(e.getMessage());
        resultStruct.setCode(SYSTEM_EXCEPTION.getValue());
        return JSON.toJSONString(resultStruct.toString());
    }

}
