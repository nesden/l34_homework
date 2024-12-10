public class NumberHolder {
    public int intNumber;
    public float floatNumber;

    public NumberHolder() {
    }

    public NumberHolder(int intNumber) {
        this.intNumber = intNumber;
    }

    @Override
    public String toString() {
        return "NumberHolder{" +
                "intNumber=" + intNumber +
                ", floatNumber=" + floatNumber +
                '}';
    }

    public static void main(String[] args) {
        NumberHolder numConst=new NumberHolder(12);
        NumberHolder numEmp=new NumberHolder();
        System.out.println(numConst);
        System.out.println(numEmp);
        System.out.println(numEmp);
    }
}
