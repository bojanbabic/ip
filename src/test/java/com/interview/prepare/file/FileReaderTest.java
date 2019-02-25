package com.interview.prepare.file;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileReaderTest {

    @Test
    public void readLast() throws IOException {
        FileReader fr = new FileReader();
        String f = "/var/groupon/deep_learning/deepdealclassifier-mlengine/data/DeepDealClassifier/clickmodel_20190129_153127/targetIds";
//        fr.readLast(10, f);
        fr.readFirstBytes(4, f);
    }
}