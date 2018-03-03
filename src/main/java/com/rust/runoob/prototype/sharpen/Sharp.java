package com.rust.runoob.prototype.sharpen;

/**
 * FileName:    Sharp
 * Author:      Rust
 * Date:        2018/1/17
 * Description:
 */
public abstract class Sharp implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Sharp clone() throws CloneNotSupportedException {
        Sharp clone = null;

        try {
            clone = (Sharp) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
