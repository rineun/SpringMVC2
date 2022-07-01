package hello.typeconverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.ParseException;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MyNumberFormatterTest {
    MyNumberFormatter formatter = new MyNumberFormatter();

    @Test

    void parse() throws ParseException {
        Number result = formatter.parse("1,000", Locale.KOREA);
        Assertions.assertThat(result).isEqualTo(1000L); //LONG 타입주의
   }

    @Test
    void print() {
        String result = formatter.print(1000, Locale.KOREA);
        Assertions.assertThat(result).isEqualTo("1,000");
    }
}
