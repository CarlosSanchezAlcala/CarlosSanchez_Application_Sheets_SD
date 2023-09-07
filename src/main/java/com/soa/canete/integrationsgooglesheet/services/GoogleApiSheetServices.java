package com.soa.canete.integrationsgooglesheet.services;

import com.soa.canete.integrationsgooglesheet.googleapi.util.GoogleApiSheets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;

@Service
public class GoogleApiSheetServices {

    @Autowired(required = true)
    GoogleApiSheets googleApiSheets;

    public List<Map<Object, Object>> readDataFromGoogleSheet() throws GeneralSecurityException, IOException {
        return googleApiSheets.getDataFromGoogleSheet();
    }
}
