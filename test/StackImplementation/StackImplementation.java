/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackImplementation;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author hp
 */
public class StackImplementation {
    
    public StackImplementation() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testPushPop(Object list1) {
        StackImplentation st=new StackImplentation();
         final Object elt1 = new Object();
        st.push(elt1);
        Assert.assertTrue(st.size()==1);
        final Object elt2= new Object();
        st.push(elt2);
        Assert.assertTrue(st.size()==2);
        final Object elt3 = new Object();
        st.push(elt3);
        Assert.assertTrue(st.size()==3);
        final Object firstPoped=st.pop();
        Assert .assertTrue(firstPoped.equals(elt1));
        Assert.assertTrue(st.size()==2);
        final Object secondPoped=st.pop();
        Assert .assertTrue(secondPoped.equals(elt2));
        Assert.assertTrue(st.size()==1);
        final Object thirdPoped=st.pop();
        Assert.assertTrue(thirdPoped.equals(elt3));
        Assert.assertTrue(st.size()==0);  
    }
    @Test(expected =Exception.class)
    public void testWrongPop(){
        StackImplentation st=new StackImplentation();
        st.pop();
    }    
    }
