package com.daigou.sg.rpc.order;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TOrderRemark extends BaseModule<TOrderRemark> implements Serializable {
    public int id;
    public String remark;
    public boolean needReply;
    public String attachments;
    public String createDate;
    public String creator;
    public int offsetId;
}
