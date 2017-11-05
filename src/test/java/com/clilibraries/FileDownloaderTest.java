package com.clilibraries;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FileDownloaderTest {

    @Test
    public void fileDownloaderShouldAcceptUrlAndLocationValues() {
        String url = "dummy url";
        String location = "dummy location";
        FileDownloader fileDownloader = new FileDownloader(url, location);
        assertTrue(Objects.nonNull(fileDownloader));
    }

    @Test
    public void verifyExistenceOfUrlAndLocationValues() {
        String url = "dummy url";
        String location = "dummy location";
        FileDownloader fileDownloader = new FileDownloader(url, location);
        assertEquals(url, fileDownloader.getUrl());
        assertEquals(location, fileDownloader.getLocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyWhetherUrlIsEmptyOrNot() {
        String url = "";
        String location = "dummy location";
        FileDownloader fileDownloader = new FileDownloader(url, location);
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyWhetherUrlIsValidOrNot() {
        String url = "dummy url";
        String location = "dummy location";
        FileDownloader fileDownloader = new FileDownloader(url, location);
    }


}
