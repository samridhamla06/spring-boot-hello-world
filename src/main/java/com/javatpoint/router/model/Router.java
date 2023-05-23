package com.javatpoint.router.model;

import com.javatpoint.router.exception.ErrorCode;
import com.javatpoint.router.exception.IncorrectPathException;
import com.javatpoint.router.util.RouterUtil;

import java.util.HashMap;
import java.util.Map;


public class Router implements IRouter{

    private Map<String, String> routerPaths;

    public Router() {
        this.routerPaths = new HashMap<>();
    }

    @Override
    public void withRoute(String path, String result) {
        routerPaths.put(path, result);
    }

    @Override
    public String route(String path) throws IncorrectPathException {
        for(String key : routerPaths.keySet()){
            if(RouterUtil.isAMatch(key, path)){
                return routerPaths.get(key);
            }
        }
        throw new IncorrectPathException(path + " is incorrect ", ErrorCode.INCORRECT_PATH);
    }
}
