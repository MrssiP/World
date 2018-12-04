package pers.mrssip.world.web.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * @author MrssiP
 * @date 2018/11/20
 */
@Builder
@Getter
public class Result{

    /**
     * 返回值
     */
    private int code;

    /**
     * 错误消息
     */
    private String msg;

    /**
     * 结果对象
     */
    private Object data;
}
