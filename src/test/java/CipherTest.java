import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void newCipher_instanceCorrectly() {
        Cipher testCipher = new Cipher("a",2);
        assertEquals(true, testCipher instanceof Cipher);

    }

    @Test
    public void newCipher_getStatement_a() {
        Cipher testCipher = new Cipher("a",2);
        assertEquals("a",testCipher.getStatement());

    }

    @Test
    public void newCipher_getKey_2() {
        Cipher testCipher =new Cipher("a",2);
        assertEquals(2,testCipher.getKey());
    }
}