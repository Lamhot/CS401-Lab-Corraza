package enum_test;

import java.util.Comparator;

class MyEnumComparator implements Comparator<MyEnum>
{
    public int compare(MyEnum o1, MyEnum o2)
    {
  //      return -o1.compareTo(o2); // this flips the order
        return o1.sound.length() - o2.sound.length(); // this compares length
    }
}