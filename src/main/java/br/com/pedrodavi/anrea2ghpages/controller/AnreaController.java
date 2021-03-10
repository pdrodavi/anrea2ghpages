package br.com.pedrodavi.anrea2ghpages.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AnreaController {

    @PostMapping(path = "/angular", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String convertAngular(@RequestBody String angularRequest) {

        JSONObject jsonObject = new JSONObject(angularRequest);

        JSONArray projects = jsonObject.getJSONObject("projects").names();
        List<Object> keys = projects.toList();
        Object keyMaster = keys.get(0);

        String toReplace = "dist/" + keyMaster.toString();
        return angularRequest.replaceAll(toReplace, "docs/");

    }

}
