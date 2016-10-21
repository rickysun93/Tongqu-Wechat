package com.sjtu.Datamodels;

/**
 * Created by sunhaoran on 2016/10/21.
 */
public class Sendalltext {
    private Sendalltext_filter filter;

    private Sendalltext_text text;

    private String msgtype="text";

    public Sendalltext_filter getFilter() {
        return filter;
    }

    public void setFilter(Sendalltext_filter filter) {
        this.filter = filter;
    }

    public Sendalltext_text getText() {
        return text;
    }

    public void setText(Sendalltext_text text) {
        this.text = text;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
}
