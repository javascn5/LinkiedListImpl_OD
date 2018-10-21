package com.sda.git;

public interface CustomList<E> {
    public E get(int index);

    public void add(E e);

    public int size();

    public void prinlist();
    public  void addTail(E e);
    public  void find( int index);



}
