package com.bigdata.domain;

/**
 * Created by stone on 2016/4/15.
 */

public class ReceivedParam {
    private int pId;
    private String dataId;
    private String queryFrom;
    private String queryFor;
    private String requestId;
    private String reportUrl;

    public  ReceivedParam(){};

    public ReceivedParam(int pId, String dataId, String queryFrom, String queryFor, String requestId, String reportUrl) {
        this.pId = pId;
        this.dataId = dataId;
        this.queryFrom = queryFrom;
        this.queryFor = queryFor;
        this.requestId = requestId;
        this.reportUrl = reportUrl;
    }


    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }


    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }


    public String getQueryFrom() {
        return queryFrom;
    }

    public void setQueryFrom(String queryFrom) {
        this.queryFrom = queryFrom;
    }


    public String getQueryFor() {
        return queryFor;
    }

    public void setQueryFor(String queryFor) {
        this.queryFor = queryFor;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReceivedParam that = (ReceivedParam) o;

        if (pId != that.pId) return false;
        if (dataId != null ? !dataId.equals(that.dataId) : that.dataId != null) return false;
        if (queryFor != null ? !queryFor.equals(that.queryFor) : that.queryFor != null) return false;
        if (queryFrom != null ? !queryFrom.equals(that.queryFrom) : that.queryFrom != null) return false;
        if (reportUrl != null ? !reportUrl.equals(that.reportUrl) : that.reportUrl != null) return false;
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pId;
        result = 31 * result + (dataId != null ? dataId.hashCode() : 0);
        result = 31 * result + (queryFrom != null ? queryFrom.hashCode() : 0);
        result = 31 * result + (queryFor != null ? queryFor.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (reportUrl != null ? reportUrl.hashCode() : 0);
        return result;
    }
}
