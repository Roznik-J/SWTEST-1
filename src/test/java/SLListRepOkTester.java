package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
    @Test public void t0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
    }
    
    // Test 1: 1 Node, ACyclic
    @Test public void t1() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
	n.elem = true;
	l.header = n;

	assertTrue(l.repOk());
    }
   
    // Test 2: 1 Node, Cyclic
    @Test public void t2() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        n.elem = true;
	n.next = n;
	l.header = n;

        assertFalse(l.repOk());
    }
    // Test 3: 2 Nodes, ACyclic
    @Test public void t3() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        n.elem = true;
	l.header = n;
	Node m = new Node();
	m.elem = true;
	n.next = m;

        assertTrue(l.repOk());
    }
    // Test 4: 2 Nodes, Cyclic
    @Test public void t4() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        n.elem = true;
	l.header = n;
        Node m = new Node();
        m.elem = true;
        n.next = m;
	m.next = m;

        assertFalse(l.repOk());
    }
    // Test 5: 2 Nodes, Cyclic
    @Test public void t5() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        n.elem = true;
	l.header = n;
        Node m = new Node();
        m.elem = true;
        n.next = m;
        m.next = n;

        assertFalse(l.repOk());
    }

    // your code goes here
}
