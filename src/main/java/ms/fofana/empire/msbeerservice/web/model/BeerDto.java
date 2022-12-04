package ms.fofana.empire.msbeerservice.web.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @Author AFO
 * @Date 04/12/2022
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private BeerStyleEnum beerStyleEnum;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
