import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {

    /**
     * 28 TestCase kiểm thử phân vùng tương đương
     */
    @Test
    public void testEquivalencePartition1() {
        String output = Bank.bankInterestRate(-1000, "canhan", true, -999999999);
        assertEquals("So tien khong hop le", output);
    }

    @Test
    public void testEquivalencePartition2() {
        String output = Bank.bankInterestRate(-1000000, "canhan", true, 1);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition3() {
        String output = Bank.bankInterestRate(-12080000, "canhan", true, 5);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition4() {
        String output = Bank.bankInterestRate(-160000, "canhan", true, 7);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition5() {
        String output = Bank.bankInterestRate(-100000000, "canhan", true, 12);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition6() {
        String output = Bank.bankInterestRate(-1000, "canhan", false, -1);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition7() {
        String output = Bank.bankInterestRate(0, "canhan", false, 245);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition8() {
        String output = Bank.bankInterestRate(-12000, "tochuc", true, 0);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition9() {
        String output = Bank.bankInterestRate(-10125050, "tochuc", true, 2);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition10() {
        String output = Bank.bankInterestRate(-762000, "tochuc", true, 3);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition11() {
        String output = Bank.bankInterestRate(0, "tochuc", true, 8);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition12() {
        String output = Bank.bankInterestRate(-9, "tochuc", true, 36);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition13() {
        String output = Bank.bankInterestRate(-1000, "tochuc", false, -999);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition14() {
        String output = Bank.bankInterestRate(-999, "tochuc", false, 1);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testEquivalencePartition15() {
        String output = Bank.bankInterestRate(1000, "canhan", true, -1);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testEquivalencePartition16() {
        String output = Bank.bankInterestRate(1205000, "canhan", true, 1);
        assertEquals("So lai la 3013 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition17() {
        String output = Bank.bankInterestRate(11500, "canhan", true, 4);
        assertEquals("So lai la 134 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition18() {
        String output = Bank.bankInterestRate(159000, "canhan", true, 11);
        assertEquals("So lai la 6559 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition19() {
        String output = Bank.bankInterestRate(100000000, "canhan", true, 12);
        assertEquals("So lai la 5500000 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition20() {
        String output = Bank.bankInterestRate(90000, "canhan", false, 0);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testEquivalencePartition21() {
        String output = Bank.bankInterestRate(1111111, "canhan", false, 32);
        assertEquals("So lai la 195 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition22() {
        String output = Bank.bankInterestRate(13110, "tochuc", true, -1);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testEquivalencePartition23() {
        String output = Bank.bankInterestRate(1000000000, "tochuc", true, 2);
        assertEquals("So lai la 4500000 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition24() {
        String output = Bank.bankInterestRate(999999, "tochuc", true, 3);
        assertEquals("So lai la 8250 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition25() {
        String output = Bank.bankInterestRate(123689, "tochuc", true, 6);
        assertEquals("So lai la 2659 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition26() {
        String output = Bank.bankInterestRate(756250000, "tochuc", true, 24);
        assertEquals("So lai la 74112500 VNĐ", output);
    }
    @Test
    public void testEquivalencePartition27() {
        String output = Bank.bankInterestRate(11250, "tochuc", false, -10000);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testEquivalencePartition28() {
        String output = Bank.bankInterestRate(695250, "tochuc", false, 245);
        assertEquals("So lai la 933 VNĐ", output);
    }

    /**
     * 15 TestCase kiểm thử theo bảng quyết định
     */
    @Test
    public void testDecisionTable1() {
        String output = Bank.bankInterestRate(-1000, "canhan", false, 365);
        assertEquals("So tien khong hop le", output);
    }
    @Test
    public void testDecisionTable2() {
        String output = Bank.bankInterestRate(9995641, "canhan", false, -1);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testDecisionTable3() {
        String output = Bank.bankInterestRate(400000000, "canhan", false, 45);
        assertEquals("So lai la 98630 VNĐ", output);
    }
    @Test
    public void testDecisionTable4() {
        String output = Bank.bankInterestRate(10000, "canhan", true, 0);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testDecisionTable5() {
        String output = Bank.bankInterestRate(2805000, "canhan", true, 1);
        assertEquals("So lai la 7013 VNĐ", output);
    }
    @Test
    public void testDecisionTable6() {
        String output = Bank.bankInterestRate(198000, "canhan", true, 3);
        assertEquals("So lai la 1733 VNĐ", output);
    }
    @Test
    public void testDecisionTable7() {
        String output = Bank.bankInterestRate(36259840, "canhan", true, 6);
        assertEquals("So lai la 815846 VNĐ", output);
    }
    @Test
    public void testDecisionTable8() {
        String output = Bank.bankInterestRate(1250000, "canhan", true, 12);
        assertEquals("So lai la 68750 VNĐ", output);
    }
    @Test
    public void testDecisionTable9() {
        String output = Bank.bankInterestRate(1000, "tochuc", false, -10);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testDecisionTable10() {
        String output = Bank.bankInterestRate(36000000, "tochuc", false, 1);
        assertEquals("So lai la 197 VNĐ", output);
    }
    @Test
    public void testDecisionTable11() {
        String output = Bank.bankInterestRate(100000, "tochuc", true, 0);
        assertEquals("Ky han khong hop le", output);
    }
    @Test
    public void testDecisionTable12() {
        String output = Bank.bankInterestRate(19585000, "tochuc", true, 2);
        assertEquals("So lai la 88133 VNĐ", output);
    }
    @Test
    public void testDecisionTable13() {
        String output = Bank.bankInterestRate(1000000000, "tochuc", true, 5);
        assertEquals("So lai la 13750000 VNĐ", output);
    }
    @Test
    public void testDecisionTable14() {
        String output = Bank.bankInterestRate(9236000, "tochuc", true, 11);
        assertEquals("So lai la 364052 VNĐ", output);
    }
    @Test
    public void testDecisionTable15() {
        String output = Bank.bankInterestRate(86452000, "tochuc", true, 36);
        assertEquals("So lai la 12708444 VNĐ", output);
    }

}
