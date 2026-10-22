package ua.com.kisit.unit3;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyJUnitTest {

    /*
     * Формати:
     *
     * 0505923502
     * 050 592 35 02
     * 050-592-35-02
     * 050-592-3-502
     * (050) 592-35-02
     *
     * +380505923502
     * +380 50 592 35 02
     * +38 (050) 592-35-02
     * +380 (50) 592-35-02
     *
     * Міжнародний код є необов'язковим.
     */

    private static final String PHONE_REGEX =
            "^(?:"
                    // 10 цифр: 050 592 35 02
                    + "(?:\\(\\d{3}\\)|\\d{3})[ .-]?\\d{3}[ .-]?"
                    + "(?:\\d{4}|\\d{2}[ .-]?\\d{2}|\\d[ .-]?\\d{3})"

                    // Міжнародний формат з + і кодом 1-3 цифри:
                    // +80 (50) 592 35 02
                    // +111 (202) 555-0125
                    + "|\\+\\d{1,3}[ ]?(?:\\(\\d{2,3}\\)|\\d{2,3})[ .-]?\\d{3}[ .-]?"
                    + "(?:\\d{4}|\\d{2}[ .-]?\\d{2}|\\d[ .-]?\\d{3})"

                    // Український код 380 без +
                    // 380 50 592 35 02
                    + "|380[ ](?:\\(\\d{2}\\)|\\d{2})[ .-]?\\d{3}[ .-]?"
                    + "(?:\\d{4}|\\d{2}[ .-]?\\d{2}|\\d[ .-]?\\d{3})"

                    // 380505923502
                    + "|380(?:\\d{2})\\d{3}"
                    + "(?:\\d{4}|\\d{2}\\d{2}|\\d\\d{3})"

                    + ")$";

    private final Pattern pattern = Pattern.compile(PHONE_REGEX);


    // 1. Перевірка номера з 10 цифр
    @Test
    void shouldAcceptTenDigitsNumber() {
        assertTrue(isValid("2055550125"));
    }


    // 2. Перевірка номера з пробілами
    @Test
    void shouldAcceptNumberWithSpaces() {
        assertTrue(isValid("202 555 0125"));
    }


    // 3. Перевірка номера з дефісами
    @Test
    void shouldAcceptNumberWithHyphens() {
        assertTrue(isValid("202-555-0125"));
    }


    // 4. Перевірка номера з крапками
    @Test
    void shouldAcceptNumberWithDots() {
        assertTrue(isValid("202.555.0125"));
    }


    // 5. Перевірка номера з дужками
    @Test
    void shouldAcceptNumberWithParentheses() {
        assertTrue(isValid("(202) 555-0125"));
    }


    // 6. Перевірка номера з міжнародним префіксом
    @Test
    void shouldAcceptNumberWithInternationalPrefix() {
        assertTrue(isValid("+111 (202) 555-0125"));
    }


    // 7. Перевірка українського номера
    @Test
    void shouldAcceptUkrainianNumber() {
        assertTrue(isValid("+380 50 592 35 02"));
    }


    // 8. Перевірка масиву коректних номерів
    @Test
    void shouldAcceptValidPhoneNumbers() {

        String[] validPhoneNumbers = {
                "2055550125",
                "202 555 0125",
                "202-555-0125",
                "202.555.0125",
                "(202) 555-0125",

                "380505923502",
                "+380505923502",
                "+38 050 592 35 02",
                "+38 (050) 592 35 02",
                "+38 (050) 592-35-02",
                "+38 (050) 592-3-502",

                "(050) 592-35-02",
                "050 592 35 02",
                "050 592 3502",
                "050 592 3 502",
                "050-592-3-502",

                "+80 (50) 592 35 02",
                "380 (50) 592 35 02",
                "+380 (50) 592 35 02",
                "+380 (50) 592-35-02",
                "+380 50 592-35-02"
        };

        for (String phoneNumber : validPhoneNumbers) {

            assertTrue(
                    isValid(phoneNumber),
                    "Номер повинен бути коректним: " + phoneNumber
            );
        }
    }


    // 9. Перевірка некоректних номерів
    @Test
    void shouldRejectInvalidPhoneNumbers() {

        String[] invalidPhoneNumbers = {
                "123",
                "123456789",
                "12345678901",

                "05059235",
                "050592350",
                "05059235021",

                "050ABC1234",
                "abcdefghij",

                "050 592",
                "050-592",

                "+",
                "++380505923502",
                "+380",

                "+380ABC123456",

                "(050 592-35-02",
                "050) 592-35-02",

                "050 592 35 02 abc",

                "123 456 789",
                "12 345 67",
                "1234 567 890",

                "+380 50 592",
                "+380 50 592 35",

                "050--592--35--02",
                "050..592..35..02",
                "050  592 35 02"
        };

        for (String phoneNumber : invalidPhoneNumbers) {

            assertFalse(
                    isValid(phoneNumber),
                    "Номер не повинен бути коректним: " + phoneNumber
            );
        }
    }


    // Метод перевірки номера
    private boolean isValid(String phoneNumber) {

        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}
