package com.home.model;
class Message{
    private String note;
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}
class MessageConsumer{
    public void print(){
        System.out.println(Thread.currentThread().getName() + " = " + MyUtil.get().getNote());
    }
}

class MyUtil{
    /**
     * ThreadLocal可以帮助我们减少一些重要的引用传递
     */
    private static ThreadLocal<Message> threadLocal = new ThreadLocal<Message>();
    public static void set(Message msg){
        threadLocal.set(msg);
    }
    public static Message get(){
        return threadLocal.get();
    }
}
public class Eight {
    public static void main(String[] args) throws Exception{
        new Thread(() -> {
            Message msg = new Message();
            msg.setNote("www.mldn.cn");
            MyUtil.set(msg);
            new MessageConsumer().print();
        },"用户A").start();
        new Thread(() -> {
            Message msg = new Message();
            msg.setNote("速度gags的发生");
            MyUtil.set(msg);
            new MessageConsumer().print();
        },"用户B").start();
    }
}
