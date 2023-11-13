package org.gis.render.be.service;

/**
 * @author Denis I.
 */
public interface BaseRenderObjectsService<SizeT, BBoxType, OutputEntityType> {

    OutputEntityType renderObject(SizeT width, SizeT height, BBoxType bBox);
}
