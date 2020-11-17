public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        String string = "one";
        Integer numberOne = 1;
        double numberTwo = 100.0;

        BlackList blackList = new BlackList();
        blackList.addClass(numberOne.getClass());

        Stack stack = new Stack(blackList);

        stack.add(numberOne);
        stack.add(string);
        stack.add(string);
        stack.add(numberTwo);
        System.out.println(stack.toString());

        System.out.println(stack.peek().toString());
        System.out.println(stack.pop().toString());
        System.out.println(stack.toString());
    }
}
