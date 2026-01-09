package org.javaturk.ioop.ex.ch19;

public class InstanceCounter {
    static int count;

    int instanceNumber = ++count;
    String name;

    InstanceCounter(){
        name = "No name!";
        //count++;
    }

    InstanceCounter(String name){
        this();
        this.name = name;
    }

    static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        InstanceCounter instance1 = new InstanceCounter();
        System.out.println(instance1.instanceNumber);
        InstanceCounter instance2 = new InstanceCounter("ali");
        System.out.println(instance2.instanceNumber);

        for(int i = 0; i < 100; i++) {
            InstanceCounter ic = new InstanceCounter(i + " ");
            System.out.println(ic.instanceNumber);
        }

        System.out.println(InstanceCounter.count);
        System.out.println(instance1.count);
        System.out.println(instance2.count);
        System.out.println(InstanceCounter.getCount());
    }
}
