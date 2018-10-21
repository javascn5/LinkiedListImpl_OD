package com.sda.git;

public class CustomLinkiedlist<E> implements CustomList<E> {

    private int size;
    private Node head;


    public CustomLinkiedlist() {
        head = new Node(null);
    }

    @Override

    public void add(E e) {
        Node copy = head;
        System.out.println("Wartosc copy " + copy);
        head = new Node(e);
        System.out.println("Wartosc head" + head);
        head.next = copy;
        System.out.println("Wartosc head.next " + head.next);
        size++;
    }

    @Override
    public E get(int index) {
        return null;
    }


    @Override
    public int size() {
        return 0;
    }

    class Node {
        private Node next;
        private Object dane;


        public Node(Object dane) {
            this.dane = dane;
        }

        public Object getDate() {
            return this.dane;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "dane=" + dane +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public void addTail(E e) {
        Node tmp =head;
        while (tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next =new Node(e);

    }

    @Override
    public void find(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        System.out.println(tmp);

    }

    public void prinlist() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.dane);
            tmp = tmp.next;
        }

    }
}



