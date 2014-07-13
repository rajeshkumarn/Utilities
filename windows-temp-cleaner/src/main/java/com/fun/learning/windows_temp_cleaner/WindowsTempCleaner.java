package com.fun.learning.windows_temp_cleaner;

import java.io.File;

/**
 * Hello world!
 */
public class WindowsTempCleaner
{
    public static void main(String[] args)
    {
        String userHome = System.getProperty("user.home");

        File tempFolder = new File(userHome + "\\AppData\\Local\\Temp\\");

        String[] files = tempFolder.list();

        System.out.println(files.length);

        for (String fileName : files)
        {
            File tempFile = new File(tempFolder + fileName);

            System.out.println(tempFile.getAbsolutePath() + ":" + tempFile.delete());

        }

    }
}
