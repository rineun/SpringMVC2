package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IpPortToStringConverterTest {
    @Test
    void stringToPort(){
        StringToIpPortConverter convert = new StringToIpPortConverter();
        String source = "127.0.0.1:8080";
        IpPort result = convert.convert(source);
        Assertions.assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));

    }

    @Test
    void ipPortToString(){
        IpPortToStringConverter convert = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8080);
        String result = convert.convert(source);
        Assertions.assertThat(result).isEqualTo("127.0.0.1:8080");
    }

}
