package com.example.user.model;

/**
 * Created by user on 2017/12/18.
 */
public class OrderItem {
    private int sid;
    private int oid;
    private int did;
    private int iid;
    private int num;
    public int getIid(){
        return iid;
    }
    public void setIid(int iid){
        this.iid=iid;
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public int getOid() {
        return oid;
    }
    public void setOid(int oid) {
        this.oid = oid;
    }
    public int getDid() {
        return did;
    }
    public void setDid(int did) {
        this.did = did;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}
