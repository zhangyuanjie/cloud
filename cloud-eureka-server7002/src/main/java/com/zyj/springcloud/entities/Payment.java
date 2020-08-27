package com.zyj.springcloud.entities;

import java.io.Serializable;

/**
 * @description:
 * @author: zyj
 * @time: 2020-08-04 22:44
 */
public class Payment implements Serializable {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    } 

    public String getSerial() {
        return serial;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Payment() {
    }

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }
}
