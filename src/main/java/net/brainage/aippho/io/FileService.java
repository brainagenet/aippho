/*
 * (#) net.brainage.aippho.io.MyFileVisitor.java
 * Created on 2016-04-05
 *
 * Copyright 2015 brainage.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package net.brainage.aippho.io;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ms29.seo on 2016-04-05.
 */
@Slf4j
public class FileService {

    public List<Path> collectTargetFiles(Path path, String... extensions) throws IOException {
        List<Path> targetList = Files.walk(path)
                .filter(p -> {
                    for (String ext : extensions) {
                        if (p.toString().toLowerCase().endsWith("." + ext)) {
                            return true;
                        }
                    }
                    return false;
                }).collect(Collectors.toList());
        if (log.isDebugEnabled()) {
            targetList.forEach(this::debug);
        }
        return targetList;
    }

    private void debug(Object obj) {
        log.debug(obj.toString());
    }

    public static void main(String[] args) throws IOException {
        FileService fileService = new FileService();
        Path path = Paths.get("c:/Users/ms29.seo/Pictures");
        String[] exts = {"jpg", "png", "gif"};
        List<Path> list = fileService.collectTargetFiles(path, exts);
        list.forEach(System.out::println);
    }

}
