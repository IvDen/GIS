package org.gis.render.be.dto;

import lombok.Data;
import java.awt.geom.Point2D;
import java.io.Serial;
import java.io.Serializable;

import jakarta.validation.constraints.NotNull;

/**
 * @author Denis I.
 */
@Data
public class BBoxDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 5995618206957197835L;
//TODO validate relation between min and max
    @NotNull
//    @Size(min = -20037508.34, max = 20037508.34, message = FIELD_SIZE_VIOLATED)
    private Point2D.Double topLeftEpsg3857;

    @NotNull
//    @Size(min = -20037508.34, max = 20037508.34, message = FIELD_SIZE_VIOLATED)
    private Point2D.Double bottomRightEpsg3857;

//
//    @NotNull
////    @Size(min = -20048966.1, max = 20048966.1, message = FIELD_SIZE_VIOLATED)
//    private BigDecimal maxYEpsg3857;
//
//    @NotNull
////    @Size(min = -20037508.34, max = 20037508.34, message = FIELD_SIZE_VIOLATED)
//    private BigDecimal minXEpsg3857;
//
//    @NotNull
////    @Size(min = -20048966.1, max = 20048966.1, message = FIELD_SIZE_VIOLATED)
//    private BigDecimal minYEpsg3857;
}
