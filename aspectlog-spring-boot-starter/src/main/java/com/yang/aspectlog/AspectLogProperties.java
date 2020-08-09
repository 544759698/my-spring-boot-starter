package com.yang.aspectlog;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件对应类
 *
 * @Author: yangguojun01
 * @Date: 2020/8/9
 */
@ConfigurationProperties("aspectLog")
public class AspectLogProperties {
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}