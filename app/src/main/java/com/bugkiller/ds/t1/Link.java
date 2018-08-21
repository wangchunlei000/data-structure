package com.bugkiller.ds.t1;

/**
 * 链表
 *
 * @author dwb
 */
public class Link {
    /** 头结点 */
    Node head;

    public Link() {
        head = new Node();
        head.next = null;
    }

    /**
     * 新增节点
     *
     * @param data 新节点
     */
    public void add(String data) {
        //1.获取表头
        Node p = head;

        //2.通过表头找到最后一个元素
        while (p.next != null) {
            p = p.next;
        }

        //3.把新增的节点放到最后一个元素后面
        p.next = new Node(data);
    }

    /**
     * 删除节点
     *
     * @param data
     */
    public void remove(String data) {
        Node p = head;
        while (p.next != null) {
            if (p.next.name.equals(data)) {
                //要删除的节点
                p.next = p.next.next;
                break;
            } else {
                p = p.next;
            }
        }
    }

    /**
     * 展示全部节点
     */
    public void display() {
        Node p = head;

        while (p.next != null) {
            System.out.println("p.name->" + p.next.name);
            p = p.next;
        }
    }

    /**
     * 查找节点
     *
     * @param data
     */
    public void find(String data) {
        Node p = head;

        while (p.next != null) {
            if (p.next.name.equals(data)) {
                System.out.println("find->" + p.next.name);
                break;
            } else {
                p = p.next;
            }
        }
    }

    /**
     * 链表长度
     *
     * @return
     */
    public int size() {
        int length = 0;
        Node p = head;
        while (p.next != null) {
            length++;
            p = p.next;
        }

        return length;
    }

    /**
     * 插入节点
     *
     * @param previous
     * @param data
     */
    public void insert(String previous, String data) {
        Node p = head;
        while (p.next != null) {
            if (p.next.name.equals(previous)) {
                Node node = new Node(data);
                node.next = p.next.next;
                p.next.next = node;
                break;
            } else {
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        Link link = new Link();
        link.add("组长");
        link.add("部门经理");
        link.add("主管副总");
        link.add("总经理");
        link.add("总裁");

        link.display();
        System.out.println("--------------增加节点--------------");
        link.add("CEO");
        link.display();
        System.out.println("--------------插入节点--------------");
        link.insert("主管副总", "PMO");
        link.display();
        System.out.println("--------------删除节点--------------");
        link.remove("组长");
        link.display();
    }
}
