package com.tommyputranto.cafe_api.dao;

/**
 * Created by tommy on 9/17/16.
 */
public class BaseApiDao {

    private SummaryDao summary;

    private String code;
    private String fields;
    private String message;

    public String getCode() {
        if (summary != null) {
            return summary.getCode();
        } else {
            return code;
        }
    }

    public String getFields() {
        return (summary != null) ? summary.getFields() : fields;

    }

    public String getMessage() {
        if (message != null)
            return message;
        else if (summary != null)
            return summary.getMessage();
        return null;
    }
}
