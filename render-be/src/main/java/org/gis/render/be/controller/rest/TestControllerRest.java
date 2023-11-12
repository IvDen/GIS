package org.gis.render.be.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Denis I.
 */
@Tag(name = "Render", description = "REST-контроллер для работы с рендером.")
@RestController
@RequestMapping("/gis/render-be/v1/")
public class TestControllerRest {

    private static UUID id = UUID.randomUUID();

    @Operation(
        summary = "Stub",
        description = "Stub"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Stub")
    }
    )
    @GetMapping(value = "/stub", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> stub() {
        return new ResponseEntity<>(id.toString(), HttpStatus.OK);
    }
}
