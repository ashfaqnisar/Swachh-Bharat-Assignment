package com.rubicon.swachh.util;

public class RegularExpConstants {
    public static final String NAME_REXP = "^[a-zA-Z][a-zA-Z0-9.,_$;]+$";
    public static final String EMAIL_REXP = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static final String NUMBER_REXP = "^[6-9]\\d{9}$";
    public static final String ADDRESS_REXP="^[a-zA-Z0-9.,$;/:-]{3,30}$";

    public static final String BRAND_REXP="^[1-5$;]{1}$";
    public static final String TYPE_REXP="^[1-3$;]{1}$";

    public static final String CHOICE_REXP="^[y,Y,n,N$;]{1,3}$";
}
