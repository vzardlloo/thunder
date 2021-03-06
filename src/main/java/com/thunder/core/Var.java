package com.thunder.core;

/**
 * Created by icepoint1999 on 2/29/16.
 */
public class Var {

    private Var(){

    }


    /**
     * 默认字符集
     */
    public static final String DEFAULT_CHAR_SET = "UTF-8";

    /**
     * 当前版本号
     */
    public static final String MARIO_VERSION = "1.0.0";

    /**
     * 读取视图前缀的字段
     */
    public static final String VIEW_PREFIX_FIELD = "mario.view.prefix";

    /**
     * 读取视图后缀的字段
     */
    public static final String VIEW_SUFFIX_FIELD = "mario.view.suffix";

    /**
     * 视图前缀
     */
    public static final String VIEW_PREFIX = "/WEB-INF/";

    /**
     * 视图后缀
     */
    public static final String VIEW_SUFFIX = ".jsp";


    /**
     *执行表单的method
     */

    public static final String  GET = "GET";


    public static final String  PUT = "PUT";


    public static final String  DELETE = "DELETE";


    public static final String   POST = "POST";


    public static final String  PATCH = "PATCH" ;


}
