package com.studing.template;

/**
 * Created by fengqz on 2017-3-21.
 */
public class Duck implements Comparable {
    private String name;
    private Integer weight;
    private Integer height;

    public Duck(String name, Integer weight, Integer height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        if (this.weight > duck.weight) {
            return 1;
        } else if (this.weight == duck.weight) {
            if (this.height > duck.height) {
                return 1;
            } else if (this.height == duck.height) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "name:" + name + ", weight:" + weight + ", height:" + height;
    }
}
