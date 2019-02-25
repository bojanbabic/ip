package com.interview.lyft;

import com.interview.prepare.datastructures.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeCodecTest {


    @Test
    public void serialize() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        TreeCodec tc = new TreeCodec();
//        assertEquals("1,2,null,null,3,4,null,null,5,null,null,", tc.serialize(n1));

        String serialized = "1,2,null,null,3,4,null,null,5,null,null,";
//        TreeNode n = tc.deserialize(serialized);
//        assertEquals(1, n.val);

        tc.deserialize("");

    }
}