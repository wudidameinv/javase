package Extends;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Compu {
    public String cpu; //定义属性 可以修饰也可以不修饰
    private int memory;//private 封装用set get得到数据
    private int disk;

    //构造器
    //构造器赋值 就不需要用main方法

    public Compu(String cpu, int memory, int disk) { //记住*****
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() { //封装
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

   // public void detail(){ //void可以用return 也可以用String return system(s.detail())
    //    System.out.println(""+cpu+"memory"+memory+""+disk);//因为还要加数据 不建议用void 返回string比较好
   // }
    public String detail(){
        return " "+cpu+" memory "+memory+" "+disk;
    }
}
