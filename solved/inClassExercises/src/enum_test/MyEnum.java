package enum_test;

enum MyEnum
{
    DOG("woof"),
    CAT("meow");

    String sound;    
    MyEnum(String s) { sound = s; }
}
