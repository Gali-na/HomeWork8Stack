public class BlackList {
    private  Class[] arry = new Class[10];

    public BlackList(Class[] arry) {
        this.arry = arry;
    }

    public BlackList() {
    }

    public Class[] getArry() {
        return arry;
    }

    public void setArry(Class[] arry) {
        this.arry = arry;
    }

    public void addClass(Class myClass) {
        for (int i = 0; i < this.arry.length; i++) {
            if (arry[i] == null) {
                arry[i] = myClass;
            }
        }
    }

    public void delClass(Class myClass) {
        for (int i = 0; i < this.arry.length; i++) {
            if (arry[i] == myClass) {
                arry[i] = null;
            }
        }
    }
}
