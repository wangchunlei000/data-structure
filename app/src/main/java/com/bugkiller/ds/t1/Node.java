package com.bugkiller.ds.t1;


/**
 * 节点类
 * 1.数据域
 * 2.链域
 *
 * @author dwb
 */
public class Node {
    /**
     * 数据域
     */
    String name;

    /**
     * 下一个节点的地址
     */
    Node next;

    public Node() {

    }

    public Node(String name) {
        this.name = name;
        this.next = null;
    }
}
