package com.study.servlet.util;

public class NaiveHtmlTemplate {
    /**
     * 在 head 标签和 body 标签中填写内容
     *
     * @param head 要在 head 标签中填写的内容
     * @param body 要在 body 标签中填写的内容
     * @return 填写 head 标签和 body 标签后, 生成的 html 字符串
     */
    public static String fillHeadAndBody(String head, String body) {
        return "<html>\n" +
                "<head>" + head +
                "</head>\n" +
                "<body>\n" + body +
                "</body>\n" +
                "</html>";
    }

    public static String fillBody(String body) {
        return fillHeadAndBody("<title>a title</title>", body);
    }
}
