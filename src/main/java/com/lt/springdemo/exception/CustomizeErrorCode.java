package com.lt.springdemo.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你操作的问题不存在或已删除"),
    TARGET_PARENT_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"当前操作需要登录，请登录后重试"),
    SYSTEM_ERROR(2004,"发生不可预料错误，返回主页重新试试？"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"你回复的评论不存在或已删除"),
    CONTENT_IS_EMPTY(2007,"输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008,"大兄弟，你咋读到别人的信息了呢？"),
    NOTIFICATION_NOT_FOUNT(2009,"消息离家出走了？"),
    COOKIES_ARE_FORBIDDEN(2010,"浏览器禁用了cookies，请打开后重试")
    ;
    private String message;
    private Integer code;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
