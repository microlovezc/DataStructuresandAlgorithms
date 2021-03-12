import java.util.ArrayList;
import java.util.List;

public  class CreditApply {
    static String Serialno; //授信编号
    String Name;       //授信人姓名
    String VouchType;   //授信类型
    double Sum;         //授信金额

    public CreditApply(String serialno, String name, String vouchType, double sum ) {
        Serialno = serialno;
        Name = name;
        VouchType = vouchType;
        Sum = sum;
    }

    public String getSerialno() {
        return Serialno;
    }

    public String getName() {
        return Name;
    }

    public String getVouchType() {
        return VouchType;
    }

    public double getSum() {
        return Sum;
    }

    @Override
    public String toString() {
        return "CreditApply{" +
                "Serialno='" + Serialno + '\'' +
                ", Name='" + Name + '\'' +
                ", VouchType='" + VouchType + '\'' +
                ", Sum=" + Sum +
                '}';
    }

    public static void main(String[] args) {
        CreditApply creditApply=new CreditApply("1001","张三","抵押",100000.5);
        CreditApply creditApply2=new CreditApply("1002","李四","质押",50000);
        CreditApply creditApply3=new CreditApply("1003","王五","质押",30000);
        CreditApply creditApply4=new CreditApply("1004","赵六","抵押",60000.51);
        List<CreditApply> list=new ArrayList<>();
        list.add(creditApply);
        list.add(creditApply2);
        list.add(creditApply3);
        list.add(creditApply4);
        double SerialSum=0.0;
        for (CreditApply apply : list) {
            SerialSum+=apply.getSum();
        }
        double zySum=0.0;
        for (CreditApply apply : list) {
            if (apply.getVouchType().equals("质押"))
                zySum+=apply.getSum();
        }

        for (CreditApply apply : list) {
            System.out.println(apply);
        }

        System.out.println("授信的总金额为:"+SerialSum);

        System.out.println("质押的的总金额为:"+zySum);

    }
}
