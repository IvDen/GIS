package org.gis.render.be.service.impl;

import org.apache.commons.lang.NotImplementedException;
import org.gis.render.be.dto.BBoxDto;
import org.gis.render.be.repository.ObjectsToRenderRepository;
import org.gis.render.be.service.BaseRenderObjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Denis I.
 */
//@Service
@Component
public class RenderObjectsServiceImpl implements BaseRenderObjectsService<Integer, BBoxDto, ByteArrayResource> {

    private final ObjectsToRenderRepository objectsToRenderRepository;

    @Autowired
    public RenderObjectsServiceImpl(ObjectsToRenderRepository objectsToRenderRepository) {
        this.objectsToRenderRepository = objectsToRenderRepository;
    }

    @Override
    public ByteArrayResource renderObject(Integer width, Integer height, BBoxDto bBox) {
        throw new NotImplementedException();

    }
}
