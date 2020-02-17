package com.example.shangcheng.constants;


import com.example.shangcheng.base.BaseApp;

import java.io.File;

public class Constant {

    public static final String Base_Url = "https://cdwan.cn/api/";

    public static final String Base_apk_url = "http://yun918.cn/study/public/";

    public static final String Base_Wan_url = "https://www.wanandroid.com/";
    public static final String Base_shopping_url = "https://cdwan.cn/";



    //网络缓存的地址
    public static final String PATH_DATA = BaseApp.app.getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/ShiXun";

    public static final int CLICK_TIME = 2000;

    public static int uid;

}
