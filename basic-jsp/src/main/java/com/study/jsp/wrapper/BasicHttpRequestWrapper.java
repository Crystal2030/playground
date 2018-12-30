package com.study.jsp.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.HashMap;
import java.util.Map;

public class BasicHttpRequestWrapper extends HttpServletRequestWrapper {

    public BasicHttpRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        String raw = super.getParameter(name);
        return raw.toUpperCase();
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] raw = super.getParameterValues(name);
        return convert(raw);
    }

    private String[] convert(String[] raw) {
        if (raw != null) {
            for (int i = 0; i < raw.length; i++) {
                raw[i] = raw[i].toUpperCase();
            }
        }
        return raw;
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        Map<String, String[]> raw = super.getParameterMap();
        if (raw == null) {
            return null;
        }
        Map<String, String[]> result = new HashMap<>();
        for (Map.Entry<String, String[]> entry : raw.entrySet()) {
            result.put(entry.getKey(), convert(entry.getValue()));
        }
        return result;
    }
}
