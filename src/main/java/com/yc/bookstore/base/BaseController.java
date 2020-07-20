package com.yc.bookstore.base;

import java.util.HashMap;

public class BaseController {

    public static HashMap<String,Object> wrapSuccessResult(){
        HashMap<String,Object> retMap = new HashMap<>();
        retMap.put("retCode",1);
        retMap.put("retMsg","success");
        retMap.put("retData",null);
        return retMap;
    }

    public static HashMap<String,Object> wrapSuccessResult(String retMsg){
        HashMap<String,Object> retMap = new HashMap<>();
        retMap.put("retCode",1);
        retMap.put("retMsg",retMsg);
        retMap.put("retData",null);
        return retMap;
    }

    public static HashMap<String,Object> wrapSuccessResult(String retMsg,Object retData){
        HashMap<String,Object> retMap = new HashMap<>();
        retMap.put("retCode",1);
        retMap.put("retMsg",retMsg);
        retMap.put("retData",retData);
        return retMap;
    }

    public static HashMap<String,Object> wrapFailedResult(){
        HashMap<String,Object> retMap = new HashMap<>();
        retMap.put("retCode",-9999);
        retMap.put("retMsg","failed");
        retMap.put("retData",null);
        return retMap;
    }

    public static HashMap<String,Object> wrapFailedResult(String retMsg){
        HashMap<String,Object> retMap = new HashMap<>();
        retMap.put("retCode",-9999);
        retMap.put("retMsg",retMsg);
        retMap.put("retData",null);
        return retMap;
    }

    public static HashMap<String,Object> wrapFailedResult(String retMsg,Object retData){
        HashMap<String,Object> retMap = new HashMap<>();
        retMap.put("retCode",-9999);
        retMap.put("retMsg",retMsg);
        retMap.put("retData",retData);
        return retMap;
    }
}
