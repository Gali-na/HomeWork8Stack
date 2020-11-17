import java.util.Arrays;

public class Stack {
    private Object[] arry = new Object[10];
    private BlackList blackList;

    public Stack(BlackList blackList) {
        this.blackList = blackList;
    }

    public void add(Object object) {
        for (int i = 0; i < this.blackList.getArry().length; i++) {
            if (object.getClass() == blackList.getArry()[i]) {
                System.out.println("This class is blacklisted and cannot be added");
                return;
            }
        }
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == null) {
                arry[i] = object;
                return;
            }
        }
        System.out.println("Stack overflow");
    }

    public Object peek() {
        for (int i = arry.length - 1; i >= 0; i--) {
            if (arry[i] != null) {
                return arry[i];
            }
        }
        return null;
    }

    public Object pop() {
        for (int i = arry.length - 1; i >= 0; i--) {
            if (arry[i] != null) {
                Object object = arry[i];
                arry[i] = null;
                return object;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arry=" + Arrays.toString(arry) +
                '}';
    }
}
