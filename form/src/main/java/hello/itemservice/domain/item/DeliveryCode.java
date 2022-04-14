package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;

/**
 * FAST: 빠른 배송
 * NORMAL: 일반 배송
 * * SLOW: 느린 배송
 * */
@Data
@AllArgsConstructor
public class DeliveryCode {
    private String code;
    private String displayName;
}
