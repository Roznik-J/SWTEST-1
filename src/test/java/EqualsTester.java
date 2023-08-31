package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
    /*
     * P1: For any non-null reference value x, x.equals(null) should return false.
     */

    @Test public void t0() {
        assertFalse(new Object().equals(null));
    }

    @Test public void t1() {
        assertFalse(new C(1).equals(null));
    }

    @Test public void t2() {
        assertFalse(new D(0,0).equals(null));
    }

    // your test methods for P1 go here

    /*
     * P2: It is reflexive: for any non-null reference value x, x.equals(x)
     * should return true.
     */

    @Test public void t3() {
        Object lcObject = new Object();
        assertTrue(lcObject.equals(lcObject));
    }

    @Test public void t4() {
        C lcC = new C(0);
        assertTrue(lcC.equals(lcC));
    }

    @Test public void t5() {
        D lcD = new D(0,0);
        assertTrue(lcD.equals(lcD));
    }

    @Test public void t6() {
        Object lcObject = new Object();
        C lcC = new C(0);
        D lcD = new D(0,0);
	assertFalse(lcD.equals(lcC));
	assertFalse(lcD.equals(lcObject));
	assertFalse(lcC.equals(lcD));
        assertFalse(lcC.equals(lcObject));
        assertFalse(lcObject.equals(lcC));
        assertFalse(lcObject.equals(lcD));
    }

    // your test methods for P2 go here

    /*
     * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
     * should return true if and only if y.equals(x) returns true.
     */

    @Test public void t7(){
        Object lcObj = new Object();
	C lcC = new C(0);
	assertFalse(lcObj.equals(lcC));
	assertFalse(lcC.equals(lcObj));
    }

    @Test public void t8(){
        Object lcObj = new Object();
        D lcD = new D(0,0);
	assertFalse(lcObj.equals(lcD));
        assertFalse(lcD.equals(lcObj));
    }

    @Test public void t9(){
        C lcC = new C(0);
        D lcD = new D(0,0);
        assertFalse(lcC.equals(lcD));
        assertFalse(lcD.equals(lcC));
    }

    // This seems to fail, why?

    //@Test public void t10(){
    //    Object lcObj = new Object();
    //	Object lcObj2 = new Object();
    //    assertTrue(lcObj.equals(lcObj2));
    //    assertTrue(lcObj2.equals(lcObj));
    //}

    
    @Test public void t11(){
        C lcC = new C(0);
        C lcC2 = new C(0);
        assertTrue(lcC.equals(lcC2));
        assertTrue(lcC2.equals(lcC));
    }

    @Test public void t12(){
        D lcD = new D(0,0);
        D lcD2 = new D(0,0);
        assertTrue(lcD.equals(lcD2));
        assertTrue(lcD2.equals(lcD));
    }
    

    // your test methods for P3 go here

    /*
     * P4: It is transitive: for any non-null reference values x, y, and z,
     * if x.equals(y) returns true and y.equals(z) returns true, then
     * x.equals(z) should return true.
     */

    // you do not need to write tests for P4

}
