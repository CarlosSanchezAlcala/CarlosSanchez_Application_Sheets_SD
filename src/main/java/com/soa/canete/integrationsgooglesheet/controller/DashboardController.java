package com.soa.canete.integrationsgooglesheet.controller;

import com.soa.canete.integrationsgooglesheet.services.GoogleApiSheetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;

@RestController
public class DashboardController {

    @Autowired
    private GoogleApiSheetServices googleApiSheet;

    @GetMapping("/check")
    public String check() {
        return "Estado API";
    }

    @GetMapping("/getData")
    public List<Map<Object, Object>> readDataFromGoogleSheet() throws GeneralSecurityException, IOException {
        return googleApiSheet.readDataFromGoogleSheet();
    }
}
