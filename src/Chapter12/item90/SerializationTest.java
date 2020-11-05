package Chapter12.item90;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;
import java.util.Date;

public class SerializationTest {
    public String serializeMethod() {
        Period period = new Period(new Date(), new Date());

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(period);
            // 바이트 배열로 생성된 데이터를 정상 출력하기 위해 base64 인코딩
            return Base64.getEncoder().encodeToString(bos.toByteArray());
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

    public Period deserializeMethod(String serializedString) {
        // 앞선 직렬화에서 Base64 인코딩하였으므로 다시 디코딩한다.
        byte[] decodedData = Base64.getDecoder().decode(serializedString);
        try (ByteArrayInputStream bis = new ByteArrayInputStream(decodedData);
             ObjectInputStream ois = new ObjectInputStream(bis)) {
            Object object = ois.readObject();
            return (Period) object;
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        // Test
        SerializationTest main = new SerializationTest();
        String serializedString = main.serializeMethod();
        Period period = main.deserializeMethod(serializedString);

        System.out.println(serializedString);
        System.out.println(period.toString());
    }
}
