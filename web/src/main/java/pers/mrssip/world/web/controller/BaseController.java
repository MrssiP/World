package pers.mrssip.world.web.controller;

import pers.mrssip.world.web.domain.Result;

/**
 * @author MrssiP
 * @date 2018/11/20
 */
public class BaseController {
    private static final int SUCCESS_CODE = 1;
    private static final int FAIL_CODE = 0;

    Result success(){
        return Result.builder().code(SUCCESS_CODE).build();
    }

    Result success(Object data){
        return Result.builder().code(SUCCESS_CODE).data(data).build();
    }

    Result fail(){
        return Result.builder().code(FAIL_CODE).build();
    }

    Result fail(String msg){
        return Result.builder().code(FAIL_CODE).msg(msg).build();
    }

    Result fail(int code, String msg){
        return Result.builder().code(code).msg(msg).build();
    }
}
