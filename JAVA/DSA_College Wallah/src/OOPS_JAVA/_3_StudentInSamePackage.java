package OOPS_JAVA;

 //Classes in different file but in same package
public class _3_StudentInSamePackage {
    public String name;
    private int rNo;
    double percentage;
    public int getrNo(){
        return rNo;
    }
    public void setrNO(int rNo){
        // variable name and ans name is same then use this
        this.rNo = rNo;
    }
}
