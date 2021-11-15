package com.spring.ioc.entity;

/**
 * @Description:
 * @author： see
 * @date： 2021-10-21 9:51 PM
 * @Version:
 */
public class Clothes {
    private String style;
    private String color;

    public Clothes() {
    }

    public Clothes(String style, String color) {
        this.style = style;
        this.color = color;
    }



    public void setStyle(String style) {
        this.style = style;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "style='" + style + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
