package Chapter12.item87;

import java.io.Serializable;

// 기본 직렬화에 적합한 형태
public class Name implements Serializable {

    /*
    * 성 - Null 이 아니어야함
    * @serial
    */
    private final String lastName;

    /*
     * 이름 - Null 이 아니어야함
     * @serial
     */
    private final String firstName;

    /*
     * 중간 이름 - Null 이 아니어야함
     * @serial
     */
    private final String middleName;


    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }
}
