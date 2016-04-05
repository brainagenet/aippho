/*
 * (#) net.brainage.aippho.image.ImageMetadataService.java
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
package net.brainage.aippho.image;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * Created by ms29.seo on 2016-04-05.
 */
public class ImageMetadataService {

    public static void main(String[] args) throws IOException {

        File file = Paths.get("c:\\Users\\ms29.seo\\Pictures\\2015-10\\IMG_4914.JPG").toFile();
        ImageInputStream iis = ImageIO.createImageInputStream(file);
        Iterator<ImageReader> readers = ImageIO.getImageReaders(iis);


    }

}
