package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

// Import Class under Test
import pset1.SLList.Node;
import pset1.SLList;

public class SLListAddTester {
    @Test public void test0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);

        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l

        assertTrue(l.header != null);
        // your code goes here
	
	// check if the graph is acyclic 
	assertTrue(l.repOk() == true);

	// the header should not be null
	assertTrue(l.header != null);

	// Get the first entry
	Node lcFirstNode = l.header;

	// First Entry should be true
	assertTrue(lcFirstNode.elem == true);

	// Get the second entry
	Node lcSecondNode = lcFirstNode.next;

	// Second entry should be null
	assertTrue(lcSecondNode == null);

    }

    @Test public void test1() {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);
        assertTrue(l.repOk());
        l.add(false);
        assertTrue(l.repOk());

        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l

        assertTrue(l.header != null);
        // your code goes here
	
	// list should be acyclic
	assertTrue(l.repOk() == true);

	// first entry shouldnt be null
	assertTrue(l.header != null);

	// get first entry
	Node lcFirstNode = l.header;

	// first entry should be false
	assertTrue(lcFirstNode.elem == false);

	// get the second entry
	Node lcSecondNode = lcFirstNode.next;

	// second entry should not be null
	assertTrue(lcSecondNode != null);

	// second entru should be true
	assertTrue(lcSecondNode.elem == true);

	// get the third entry
	Node lcThirdNode = lcSecondNode.next;

	// third entry should be null
	assertTrue(lcThirdNode == null);

    }
}
