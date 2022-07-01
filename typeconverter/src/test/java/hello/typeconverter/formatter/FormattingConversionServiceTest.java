package hello.typeconverter.formatter;


import hello.typeconverter.converter.IpPortToStringConverter;
import hello.typeconverter.converter.StringToIpPortConverter;
import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.format.support.DefaultFormattingConversionService;

public class FormattingConversionServiceTest {
    @Test
    void formatingConversionService(){
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();

        //컨버터등록
        conversionService.addConverter(new StringToIpPortConverter());
        conversionService.addConverter(new IpPortToStringConverter());

        // 포캣터 등록
        conversionService.addFormatter(new MyNumberFormatter());

        //컨버터사용
        IpPort ipPort = conversionService.convert("127.0.0.1:8080", IpPort.class);
        Assertions.assertThat(ipPort).isEqualTo(new IpPort("127.0.0.1",8080));

        //포맷터사용
        Assertions.assertThat(conversionService.convert(1000,String.class)).isEqualTo("1,000");
        Assertions.assertThat(conversionService.convert("1000",Long.class)).isEqualTo(1000L);
    }
}
