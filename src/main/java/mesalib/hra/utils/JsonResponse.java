package mesalib.hra.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonResponse<T> {

    public static String OK = "OK";
    public static String ERROR = "ERROR";

    private String code;
    private T content;

    public static <E> JsonResponse<E> generate(String code, E content) {
        return new JsonResponse<>(code, content);
    }

    public JsonResponse() {

    }

    public JsonResponse(String code, T content) {
        this.code = code;
        this.content = content;
    }

    public JsonResponse(String code, String errorCode, String errorMessage, Throwable t) {
        this.code = code;
        Map<String, String> errorMap = new LinkedHashMap<>();
        errorMap.put("status", errorCode);
        errorMap.put("message", errorMessage);
        if (t != null) {
            errorMap.put("Trace", exceptionTraceToString(t));
        }
        this.content = (T) errorMap;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    private String exceptionTraceToString(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

}
