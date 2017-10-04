package person_projects.pack;

public class LogicBlock {
    public static int x = 89;

    {
        x = 20;
    }

    public LogicBlock(){}
    public LogicBlock(int x){
        this.x = x;
    }
}

class Main{

    public static void main(String[] args) {
        Object obj = null;
        Object obj1 = null;
        System.out.println(obj.equals(obj1));
        LogicBlock lb = new LogicBlock();
        System.out.println(lb.x);
        LogicBlock lb1 = new LogicBlock(55);
        System.out.println(lb1.x);
    }
}
