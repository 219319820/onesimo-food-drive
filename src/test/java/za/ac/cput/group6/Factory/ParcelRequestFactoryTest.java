package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.group6.Entity.ParcelRequest;

import static org.junit.jupiter.api.Assertions.*;

class ParcelRequestFactoryTest {
    ParcelRequest parcelRequest = ParcelRequestFactory.createParcelRequest("0112","FoodParcel","12/03/2022");
    ParcelRequest parcelRequest2= parcelRequest;

    @Test

    void testIdentity(){
        assertSame(parcelRequest,parcelRequest2);

    }
    @Test
    void testEquality()
    {
        assertEquals(parcelRequest,parcelRequest2);

    }
    @Test
    @Disabled
    @DisplayName("This method should not run")

    void testDisabled()
    {
        fail("this test method should be disabled");

    }

    @Test
    @Timeout(5)
    public void timeoutTest() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Test will passed with in the time");
    }
}