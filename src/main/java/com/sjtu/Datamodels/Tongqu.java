package com.sjtu.Datamodels;

/**
 * Created by sunhaoran on 2016/10/21.
 */
public class Tongqu {
    private String version;
    private Tongqu_result result;
    private Tongqu_opt opt;
    private int error;
    private String msg;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Tongqu_result getResult() {
        return result;
    }

    public void setResult(Tongqu_result result) {
        this.result = result;
    }

    public Tongqu_opt getOpt() {
        return opt;
    }

    public void setOpt(Tongqu_opt opt) {
        this.opt = opt;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
