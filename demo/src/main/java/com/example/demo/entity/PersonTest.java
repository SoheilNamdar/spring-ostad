package com.example.demo.entity;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testPerson() {
        Person person = new Person("john", 36,"33 analogous");
        //assertEquals
        Assert.assertEquals("john", person.getName());
        Assert.assertEquals(36, person.getAge());
        Assert.assertEquals("33 analogous", person.getAddress());

    }
}
