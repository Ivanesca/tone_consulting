package com.vindur.tone_consulting.controller;

import com.vindur.tone_consulting.service.LineProcessingService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class LineProcessingController {
    private final LineProcessingService lineProcessingService;

    public LineProcessingController(LineProcessingService lineProcessingService) {
        this.lineProcessingService = lineProcessingService;
    }

    @GetMapping("/{line}/symbol-map")
    public List<Map.Entry<Character, Integer>> getSymbolMap(
            @Parameter(description = "Not empty line with max length = 6000 ")
            @PathVariable("line")
            String line
    ) {
        return lineProcessingService.computeSymbolMap(line);
    }
}
