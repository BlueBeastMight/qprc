package icu.chiou.impl;

import icu.chiou.HelloQRpc;
import icu.chiou.HiQPrc;
import icu.chiou.annotation.QRpcApi;

/**
 * Author: chiou
 * createTime: 2023/7/31
 * Description: No Description
 */
@QRpcApi
public class HiQRpcImpl implements HelloQRpc, HiQPrc {
    @Override
    public String say(String msg) {
        return null;
    }
}
