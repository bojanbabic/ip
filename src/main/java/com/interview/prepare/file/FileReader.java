package com.interview.prepare.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class FileReader {
    public void readLast(int n, String filename) throws IOException {
        Queue<String> queue = new LinkedList<>();
        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
            stream.forEach(s -> {
                if (queue.size() >= n) {
                    ((LinkedList<String>) queue).pop();
                }
                ((LinkedList<String>) queue).add(s);
            });
        }
        while (!queue.isEmpty()) {
            System.out.println(((LinkedList<String>) queue).pop());
        }
    }

    public void readFirstBytes(int n, String filename) throws IOException {
        InputStream in = new FileInputStream(filename);
        byte[] b = new byte[n];
        int totalSize = 0;
        while (totalSize < n) {
            int read = in.read(b, totalSize, n - totalSize);
            totalSize = totalSize + read;
        }
        System.out.println(new String(b, "UTF-8"));
        in.close();
    }
}
