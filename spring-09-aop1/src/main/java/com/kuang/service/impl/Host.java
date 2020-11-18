package com.kuang.service.impl;

import com.kuang.service.Rent;

/**
 * Description:
 *
 * @author wenjie
 * @date Create on 2020/11/16
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子！");
    }

    @Override
    public void fare() {
        System.out.println("房东收租！");
    }
}
