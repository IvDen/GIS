package org.gis.render.be.service.impl;

import org.gis.render.be.dto.BBoxDto;
import org.gis.render.be.repository.ObjectsToRenderRepository;
import org.gis.render.be.service.BaseRenderObjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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

    /**
     * get 3857 cooridnates
     * convert its to lat long
     * call to DB for all objects in this bounds
     * convert coords objects from lat/long to word map x/y
     * scale to image size
     */

    @Override
    public ByteArrayResource renderObject(Integer width, Integer height, BBoxDto bBox) {


        return null;
    }
}
