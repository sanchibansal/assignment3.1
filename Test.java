/**What will happen if you try to compile and run this?
Output must be one of the following:
a. Compiler error.
b. Will throw a NoSuchMethod error at runtime.
c. It will compile and run printing out "10“
d. It will run with no output.
e. It will run and print "10" and then crash with an error
**/

public class Test{
static{
print(10);
}
static void print (int x) {
System.out.println (x);
System.exit(0);
}
}
/** the expected output will be (b)
since there is no main method in the given program hence, it gives a runtime error and not a compile time error since it has no syntax error
**/