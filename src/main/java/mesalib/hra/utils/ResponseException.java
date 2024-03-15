package mesalib.hra.utils;

import io.quarkus.runtime.configuration.ProfileManager;

import java.text.SimpleDateFormat;

public class ResponseException extends RuntimeException {

    private String code;
    private String message;
    private String requestInfo;
    private Throwable exception;
    private String quarkusActiveProfile = ProfileManager.getActiveProfile();
    //private String pagerDutyKey = ConfigProvider.getConfig().getValue("pager_duty_key", String.class);
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public ResponseException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseException(String code, String message, Throwable exception) {
        this.code = code;
        this.message = message;
        this.exception = exception;
    }

    public ResponseException(String code, String message, String requestInfo, Throwable exception) {
        this.code = code;
        this.message = message;
        this.requestInfo = requestInfo;
        this.exception = exception;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(String requestInfo) {
        this.requestInfo = requestInfo;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public String getQuarkusActiveProfile() {
        return quarkusActiveProfile;
    }

    public void setQuarkusActiveProfile(String quarkusActiveProfile) {
        this.quarkusActiveProfile = quarkusActiveProfile;
    }

//    public String getPagerDutyKey() {
//        return pagerDutyKey;
//    }
//
//    public void setPagerDutyKey(String pagerDutyKey) {
//        this.pagerDutyKey = pagerDutyKey;
//    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
}
