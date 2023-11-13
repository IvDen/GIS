package org.gis.render.be.repository;

import org.gis.render.be.model.ObjectToRender;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import java.util.UUID;

/**
 * @author Denis I.
 */
public interface ObjectsToRenderRepository extends Repository<ObjectToRender, UUID>,
    JpaSpecificationExecutor<ObjectToRender> {

}
