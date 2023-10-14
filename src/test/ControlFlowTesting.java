import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControlFlowTesting {
    @Test
    public void testC2ControlFlow1() {
        String output = Bank.bankInterestRate(0, "canhan", true, 9);
        assertEquals("So tien khong hop le", output);
    }

    @Test
    public void testC2ControlFlow2() {
        String output = Bank.bankInterestRate(1000000, "tochuc", true, -10);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testC2ControlFlow3() {
        String output = Bank.bankInterestRate(12500000, "canhan", true, 2);
        assertEquals("So lai la 62500 VNĐ", output);
    }

    @Test
    public void testC2ControlFlow4() {
        String output = Bank.bankInterestRate(12500000, "canhan", false, 2);
        assertEquals("So lai la 137 VNĐ", output);
    }
    @Test
    public void testC2ControlFlow5() {
        String output = Bank.bankInterestRate(12500000, "tochuc", true, 2);
        assertEquals("So lai la 56250 VNĐ", output);
    }

    @Test
    public void testC2ControlFlow6() {
        String output = Bank.bankInterestRate(12500000, "tochuc", false, 2);
        assertEquals("So lai la 137 VNĐ", output);
    }
    @Test
    public void testC2ControlFlow7() {
        String output = Bank.bankInterestRate(8650000, "canhan", true, 5);
        assertEquals("So lai la 126146 VNĐ", output);
    }

    @Test
    public void testC2ControlFlow8() {
        String output = Bank.bankInterestRate(8650000, "canhan", false, 5);
        assertEquals("So lai la 237 VNĐ", output);
    }
    @Test
    public void testC2ControlFlow9() {
        String output = Bank.bankInterestRate(8650000, "tochuc", true, 5);
        assertEquals("So lai la 118938 VNĐ", output);
    }

    @Test
    public void testC2ControlFlow10() {
        String output = Bank.bankInterestRate(8650000, "tochuc", false, 5);
        assertEquals("So lai la 237 VNĐ", output);
    }
    @Test
    public void testC2ControlFlow11() {
        String output = Bank.bankInterestRate(100500000, "canhan", true, 9);
        assertEquals("So lai la 3391875 VNĐ", output);
    }

    @Test
    public void testC2ControlFlow12() {
        String output = Bank.bankInterestRate(100500000, "canhan", false, 9);
        assertEquals("So lai la 4956 VNĐ", output);
    }
    @Test
    public void testC2ControlFlow13() {
        String output = Bank.bankInterestRate(100500000, "tochuc", true, 9);
        assertEquals("So lai la 3241125 VNĐ", output);
    }

    @Test
    public void testC2ControlFlow14() {
        String output = Bank.bankInterestRate(100500000, "tochuc", false, 9);
        assertEquals("So lai la 4956 VNĐ", output);
    }
    @Test
    public void testC2ControlFlow15() {
        String output = Bank.bankInterestRate(1000000, "canhan", true, 36);
        assertEquals("So lai la 165000 VNĐ", output);
    }

    @Test
    public void testC2ControlFlow16() {
        String output = Bank.bankInterestRate(1000000, "canhan", false, 36);
        assertEquals("So lai la 197 VNĐ", output);
    }
    @Test
    public void testC2ControlFlow17() {
        String output = Bank.bankInterestRate(1000000, "tochuc", true, 36);
        assertEquals("So lai la 147000 VNĐ", output);
    }

    @Test
    public void testC2ControlFlow18() {
        String output = Bank.bankInterestRate(1000000, "tochuc", false, 36);
        assertEquals("So lai la 197 VNĐ", output);
    }

}
