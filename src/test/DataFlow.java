import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DataFlow {
    @Test
    public void testData1() {
        String output = Bank.bankInterestRate(-10000000, "canhan", false, 12);
        assertEquals("So tien khong hop le", output);
    }

    @Test
    public void testData2() {
        String output = Bank.bankInterestRate(15000000, "canhan", true, 2);
        assertEquals("So lai la 75000 VNĐ", output);
    }

    @Test
    public void testData3() {
        String output = Bank.bankInterestRate(500000000, "canhan", false, 120);
        assertEquals("So lai la 328767 VNĐ", output);
    }

    @Test
    public void testData4() {
        String output = Bank.bankInterestRate(45000000, "tochuc", true, 10);
        assertEquals("So lai la 1612500 VNĐ", output);
    }

    @Test
    public void testData5() {
        String output = Bank.bankInterestRate(145000000, "canhan", true, 24);
        assertEquals("So lai la 15950000 VNĐ", output);
    }

    @Test
    public void testData6() {
        String output = Bank.bankInterestRate(950080000, "tochuc", true, 1);
        assertEquals("So lai la 2137680 VNĐ", output);
    }

    @Test
    public void testData7() {
        String output = Bank.bankInterestRate(152450, "tochuc", false, -10);
        assertEquals("Ky han khong hop le", output);
    }

    @Test
    public void testData8() {
        String output = Bank.bankInterestRate(95500000, "tochuc", true, 2);
        assertEquals("So lai la 429750 VNĐ", output);
    }

    @Test
    public void testData9() {
        String output = Bank.bankInterestRate(54680251, "tochuc", false, 150);
        assertEquals("So lai la 44943 VNĐ", output);
    }

    @Test
    public void testData10() {
        String output = Bank.bankInterestRate(12000000, "canhan", true, 11);
        assertEquals("So lai la 495000 VNĐ", output);
    }

    @Test
    public void testData11() {
        String output = Bank.bankInterestRate(13110000, "canhan", true, 5);
        assertEquals("So lai la 191188 VNĐ", output);
    }

    @Test
    public void testData12() {
        String output = Bank.bankInterestRate(6580000, "canhan", false, 720);
        assertEquals("So lai la 25959 VNĐ", output);
    }

}
