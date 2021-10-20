package Decorator;

import javax.crypto.*;
import java.io.InputStream;

public class DecrypteurInputStream extends Decorator {


    public DecrypteurInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() {
        int result=0;
        try{
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();

            Cipher desCipher= Cipher.getInstance("DES");


            byte[] text = inputStream.readAllBytes();

            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);

            String s = textEncrypted.toString();
            System.out.println(s);
       //     result = Integer.valueOf(s);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
