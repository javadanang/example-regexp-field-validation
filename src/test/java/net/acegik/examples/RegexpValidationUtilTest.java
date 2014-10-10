package net.acegik.examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for RegexpValidationUtil
 */
public class RegexpValidationUtilTest {

    @Test
    public void test_valid_emails() {
        String[] sample_valid_emails = new String[] {
            "abc@example.com", "abc01@example.com", "a@example.com",
            "too_long_email_address@sub.example.com"};

        for(String sample:sample_valid_emails) {
            Assert.assertTrue( RegexpValidationUtil.verifyEmail(sample) );
        }
    }
    
    @Test
    public void test_invalid_emails() {
        String[] sample_invalid_emails = new String[] {
            "", "#ABCDEF$", "Wrong Email",
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567"};

        for(String sample:sample_invalid_emails) {
            Assert.assertFalse( RegexpValidationUtil.verifyEmail(sample) );
        }
    }
}
