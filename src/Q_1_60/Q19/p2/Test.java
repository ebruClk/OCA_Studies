package Q_1_60.Q19.p2;
import Q_1_60.Q19.p1.Acc;

public class Test extends Acc {
    public static void main(String[] args) {
        Acc obj = new Test();
        obj.s = 4;


//Protected is inheritable to sub class (outside the package) so there for if
// the sub class’ object was created then you could access to the protected variable.
// But the object was created from super class
        //Test obj = new Test();
        //        obj.s = 4;
        //        obj.r = 5;
    }
}
/**
 Which statement is true?
  A. Both p and s are accessible via obj.
  B. Only s is accessible via obj.
  C. Both r and s are accessible via obj.
  D. p, r, and s are accessible via obj.

 Answer: B


 */