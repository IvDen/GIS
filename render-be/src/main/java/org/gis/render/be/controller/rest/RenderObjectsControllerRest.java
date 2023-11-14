package org.gis.render.be.controller.rest;

import org.gis.render.be.dto.BBoxDto;
import org.gis.render.be.service.BaseRenderObjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

/**
 * @author Denis I.
 */
@Tag(name = "Render", description = "REST-контроллер для работы с рендером.")
@Validated
@RestController
@RequestMapping("/gis/render-be/v1/")
public class RenderObjectsControllerRest {

    private static UUID id = UUID.randomUUID();

    private final BaseRenderObjectsService<Integer, BBoxDto, ByteArrayResource> renderObjectsServiceImpl;

    @Autowired
    public RenderObjectsControllerRest(
        BaseRenderObjectsService<Integer, BBoxDto, ByteArrayResource> renderObjectsService) {
        this.renderObjectsServiceImpl = renderObjectsService;
    }

    @Operation(
        summary = "Stub",
        description = "Stub"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Stub")
    }
    )
    @GetMapping(value = "/render-objects/3857/", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<ByteArrayResource> stub(@RequestParam @Size(min = 1, max = 1080) int width,
                                                  @RequestParam @Size(min = 1, max = 1080) int height,
                                                  @Valid BBoxDto bBox) {
        return new ResponseEntity<>(
            new ByteArrayResource(renderObjectsServiceImpl.renderObject(width, height, bBox).getByteArray()),
            HttpStatus.OK);
    }
}
