package org.gis.render.be.model;

import lombok.experimental.FieldNameConstants;
import java.awt.geom.Rectangle2D;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Denis I.
 */
@Entity
@Table(name = "objects")
@FieldNameConstants
public class ObjectToRender implements Serializable {

    @Serial
    private static final long serialVersionUID = -9211437249929524426L;

    @Id
    @GeneratedValue
    @Column
    private UUID id;

    private Rectangle2D.Double rectangle;

}
