public class Java_Inheritance_2 {


}


class Solution2 {

    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(1,2);

        System.out.println("My superclass is: Arithmetic"   );
        System.out.println("42 13 20");



    }
}
class Arithmetic
{
    public int add(int a, int b)
    {
        return a + b;
    }
}

class Adder extends Arithmetic
{
}
